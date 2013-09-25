/*
 * STANDARD ML OF NEW JERSEY COPYRIGHT NOTICE, LICENSE AND DISCLAIMER.
 * 
 * Copyright (c) 1989-1998 by Lucent Technologies
 * 
 * Permission to use, copy, modify, and distribute this software and its
 * documentation for any purpose and without fee is hereby granted, provided
 * that the above copyright notice appear in all copies and that both the
 * copyright notice and this permission notice and warranty disclaimer appear
 * in supporting documentation, and that the name of Lucent Technologies, Bell
 * Labs or any Lucent entity not be used in advertising or publicity pertaining
 * to distribution of the software without specific, written prior permission.
 *
 * Lucent disclaims all warranties with regard to this software, including all
 * implied warranties of merchantability and fitness. In no event shall Lucent
 * be liable for any special, indirect or consequential damages or any damages
 * whatsoever resulting from loss of use, data or profits, whether in an action
 * of contract, negligence or other tortious action, arising out of or in
 * connection with the use or performance of this software. 
 *
 * Taken from this URL:
 * http://www.smlnj.org/license.html
 * 
 * This license is compatible with the GNU GPL (see section "Standard ML of New
 * Jersey Copyright License"):
 * http://www.gnu.org/licenses/license-list.html#StandardMLofNJ
 */

/*
 * Copyright 1996-1999 by Scott Hudson, Frank Flannery, C. Scott Ananian
 */


//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed May 07 11:31:09 NZST 2008
//----------------------------------------------------

package weka.core.parser.java_cup;

/** CUP generated interface containing symbol constants. */
public interface sym {
  /* terminals */
  public static final int RBRACK = 26;
  public static final int IMPORT = 3;
  public static final int LT = 29;
  public static final int INIT = 9;
  public static final int QUESTION = 30;
  public static final int NONASSOC = 23;
  public static final int CODE_STRING = 34;
  public static final int SEMI = 13;
  public static final int STAR = 15;
  public static final int LBRACK = 25;
  public static final int PRECEDENCE = 20;
  public static final int PERCENT_PREC = 24;
  public static final int CODE = 4;
  public static final int GT = 28;
  public static final int COLON = 17;
  public static final int NON = 8;
  public static final int ID = 33;
  public static final int WITH = 11;
  public static final int RIGHT = 22;
  public static final int TERMINAL = 7;
  public static final int LEFT = 21;
  public static final int COLON_COLON_EQUALS = 18;
  public static final int COMMA = 14;
  public static final int NONTERMINAL = 27;
  public static final int EOF = 0;
  public static final int PARSER = 6;
  public static final int error = 1;
  public static final int DOT = 16;
  public static final int ACTION = 5;
  public static final int START = 12;
  public static final int PACKAGE = 2;
  public static final int SUPER = 31;
  public static final int EXTENDS = 32;
  public static final int BAR = 19;
  public static final int SCAN = 10;

  /* non terminals */
  static final int NT$3 = 48;
  static final int empty = 28;
  static final int NT$2 = 47;
  static final int NT$1 = 46;
  static final int NT$0 = 45;
  static final int package_spec = 1;
  static final int precedence_list = 29;
  static final int wildcard = 44;
  static final int production_list = 11;
  static final int action_code_part = 3;
  static final int production = 21;
  static final int opt_label = 38;
  static final int nt_id = 35;
  static final int parser_code_part = 8;
  static final int type_id = 18;
  static final int spec = 0;
  static final int terminal_id = 39;
  static final int precedence_l = 32;
  static final int symbol = 17;
  static final int import_spec = 13;
  static final int start_spec = 10;
  static final int multipart_id = 12;
  static final int declares_non_term = 34;
  static final int NT$13 = 58;
  static final int term_name_list = 19;
  static final int NT$12 = 57;
  static final int NT$11 = 56;
  static final int NT$10 = 55;
  static final int import_list = 2;
  static final int init_code = 15;
  static final int typearguement = 43;
  static final int code_part = 5;
  static final int new_non_term_id = 25;
  static final int declares_term = 33;
  static final int preced = 30;
  static final int term_id = 40;
  static final int rhs = 27;
  static final int label_id = 37;
  static final int opt_semi = 6;
  static final int prod_part_list = 22;
  static final int robust_id = 41;
  static final int typearglist = 42;
  static final int new_term_id = 24;
  static final int prod_part = 23;
  static final int code_parts = 4;
  static final int scan_code = 16;
  static final int symbol_list = 9;
  static final int terminal_list = 31;
  static final int non_term_name_list = 20;
  static final int import_id = 14;
  static final int NT$9 = 54;
  static final int symbol_id = 36;
  static final int NT$8 = 53;
  static final int NT$7 = 52;
  static final int NT$6 = 51;
  static final int rhs_list = 26;
  static final int non_terminal = 7;
  static final int NT$5 = 50;
  static final int NT$4 = 49;
}

