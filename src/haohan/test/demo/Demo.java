package haohan.test.demo;

import java.io.File;
import java.io.PrintWriter;

import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.Utils;
import weka.core.converters.ArffLoader;

public class Demo {
	public static void main(String args[]) throws Exception {
		// RandomTree m_classifier = (RandomTree) SerializationHelper
		// .read(new FileInputStream("model/RFmodel"));
		// RandomForest m_classifier = (RandomForest) (new ObjectInputStream(
		// new FileInputStream("model/RFmodel"))).readObject();
		RandomForest m_classifier = (RandomForest) weka.core.SerializationHelper
				.read("ourmodel/RFmodel");

		// Classifier m_classifier = new RandomForest();

		// m_classifier.buildClassifier(null);
		File inputFile = new File("file/test.new.arff");
		ArffLoader atf = new ArffLoader();
		atf.setFile(inputFile);
		Instances instancesTest = atf.getDataSet();
		instancesTest.setClassIndex(instancesTest.numAttributes() - 1);
		// ***************
		// inputFile = new File("file/1.arff");
		// atf.setFile(inputFile);
		// Instances instancesTrain = atf.getDataSet();
		// instancesTrain.setClassIndex(instancesTest.numAttributes()-1);
		// m_classifier.buildClassifier(instancesTrain);

		// ***************

		// double sum = instancesTest.numInstances(), right = 0.0f;
		// double tp = 0.0, fp = 0.0, tn = 0.0, fn = 0.0;
		// for (int i = 0; i < sum; i++) {
		// if (m_classifier.classifyInstance(instancesTest.instance(i)) ==
		// instancesTest
		// .instance(i).classValue()) {
		// right++;
		// }
		// if (m_classifier.classifyInstance(instancesTest.instance(i)) == 1.0
		// && instancesTest.instance(i).classValue() == 1.0) {
		// tp += 1;
		// }
		// if (m_classifier.classifyInstance(instancesTest.instance(i)) == 1.0
		// && instancesTest.instance(i).classValue() == 0.0) {
		// fp += 1;
		// }
		// if (m_classifier.classifyInstance(instancesTest.instance(i)) == 0.0
		// && instancesTest.instance(i).classValue() == 1.0) {
		// fn += 1;
		// }
		// if (m_classifier.classifyInstance(instancesTest.instance(i)) == 0.0
		// && instancesTest.instance(i).classValue() == 0.0) {
		// tn += 1;
		// }
		// }
		// System.out.println("Random Forest classification precision:"
		// + (right / sum));
		// System.out.println("precision" + ((tp) / (tp + fp)));
		// System.out.println("recall" + ((tp) / (tp + fn)));
		System.out.print(m_classifier.measureOutOfBagError());
		System.out.println(m_classifier.m_bagger.m_Classifiers.toString());

		if (m_classifier.m_bagger.m_Classifiers == null) {
			System.out.println("Bagging: No model built yet.");
		} else {
			StringBuffer text = new StringBuffer();
			text.append("All the base classifiers: \n\n");
			for (int i = 0; i < m_classifier.m_bagger.m_Classifiers.length; i++)
				text.append(m_classifier.m_bagger.m_Classifiers[i].toString()
						+ "\n\n");

			if (m_classifier.m_bagger.m_CalcOutOfBag) {
				text.append("Out of bag error: "
						+ Utils.doubleToString(
								m_classifier.m_bagger.m_OutOfBagError, 4)
						+ "\n\n");
			}
			System.out.println(text.toString());
		}
		
		// String str = m_classifier.m_bagger.toString();
		// System.out.println(str);
		// PrintWriter writer = new PrintWriter("output/rules", "UTF-8");
		// writer.println(str);
		// writer.close();
		// Evaluation evaluator = new Evaluation(instancesTrain);
	}
}