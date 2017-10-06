/*
 * Copyright (C) 2017 Max 'Libra' Kersten
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package shouldersurfer;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Max 'Libra' Kersten
 */
public class Library {

    public static List<String> getBacktick() {
        List list = new ArrayList<>();
        list.add("`");
        list.add("~");
        return list;
    }

    public static List<String> get1() {
        List list = new ArrayList<>();
        list.add("1");
        list.add("!");
        list.add("0");
        list.add("2");
        list.add("4");
        list.add("5");
        return list;
    }

    public static List<String> get2() {
        List list = new ArrayList<>();
        list.add("2");
        list.add("@");
        list.add("0");
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add(".");
        return list;
    }

    public static List<String> get3() {
        List list = new ArrayList<>();
        list.add("3");
        list.add("#");
        list.add(".");
        list.add("0");
        list.add("2");
        list.add("5");
        list.add("6");
        list.add("+");
        return list;
    }

    public static List<String> get4() {
        List list = new ArrayList<>();
        list.add("4");
        list.add("$");
        list.add("1");
        list.add("7");
        list.add("8");
        list.add("5");
        list.add("2");
        return list;
    }

    public static List<String> get5() {
        List list = new ArrayList<>();
        list.add("5");
        list.add("%");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        return list;
    }

    public static List<String> get6() {
        List list = new ArrayList<>();
        list.add("6");
        list.add("^");
        list.add("3");
        list.add("2");
        list.add("5");
        list.add("8");
        list.add("9");
        list.add("+");
        return list;
    }

    public static List<String> get7() {
        List list = new ArrayList<>();
        list.add("7");
        list.add("&");
        list.add("4");
        list.add("5");
        list.add("8");
        list.add("/");
        list.add("\\");
        list.add("|");
        return list;
    }

    public static List<String> get8() {
        List list = new ArrayList<>();
        list.add("8");
        list.add("*");
        list.add("7");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("9");
        list.add("/");
        return list;
    }

    public static List<String> get9() {
        List list = new ArrayList<>();
        list.add("9");
        list.add("(");
        list.add("8");
        list.add("5");
        list.add("6");
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        return list;
    }

    public static List<String> get0() {
        List list = new ArrayList<>();
        list.add("0");
        list.add(")");
        list.add(".");
        list.add("3");
        list.add("2");
        list.add("1");
        return list;
    }

    public static List<String> getDash() {
        List list = new ArrayList<>();
        list.add("-");
        list.add("_");
        return list;
    }

    public static List<String> getPlus() {
        List list = new ArrayList<>();
        list.add("+");
        list.add("=");
        return list;
    }

    public static List<String> getQ() {
        List list = new ArrayList<>();
        list.add("q");
        list.add("Q");
        return list;
    }

    public static List<String> getW() {
        List list = new ArrayList<>();
        list.add("w");
        list.add("W");
        return list;
    }

    public static List<String> getE() {
        List list = new ArrayList<>();
        list.add("e");
        list.add("E");
        return list;
    }

    public static List<String> getR() {
        List list = new ArrayList<>();
        list.add("r");
        list.add("R");
        return list;
    }

    public static List<String> getT() {
        List list = new ArrayList<>();
        list.add("t");
        list.add("T");
        return list;
    }

    public static List<String> getY() {
        List list = new ArrayList<>();
        list.add("y");
        list.add("Y");
        return list;
    }

    public static List<String> getU() {
        List list = new ArrayList<>();
        list.add("u");
        list.add("U");
        return list;
    }

    public static List<String> getI() {
        List list = new ArrayList<>();
        list.add("i");
        list.add("I");
        return list;
    }

    public static List<String> getO() {
        List list = new ArrayList<>();
        list.add("o");
        list.add("O");
        return list;
    }

    public static List<String> getP() {
        List list = new ArrayList<>();
        list.add("p");
        list.add("P");
        return list;
    }

    public static List<String> getBracketOpen() {
        List list = new ArrayList<>();
        list.add("[");
        list.add("{");
        return list;
    }

    public static List<String> getBracketClose() {
        List list = new ArrayList<>();
        list.add("]");
        list.add("}");
        return list;
    }

    public static List<String> getPipe() {
        List list = new ArrayList<>();
        list.add("\\"); //Double backslashs because of escaping the backslash in Java
        list.add("|");
        return list;
    }

    public static List<String> getA() {
        List list = new ArrayList<>();
        list.add("a");
        list.add("A");
        return list;
    }

    public static List<String> getS() {
        List list = new ArrayList<>();
        list.add("s");
        list.add("S");
        return list;
    }

    public static List<String> getD() {
        List list = new ArrayList<>();
        list.add("d");
        list.add("D");
        return list;
    }

    public static List<String> getF() {
        List list = new ArrayList<>();
        list.add("f");
        list.add("F");
        return list;
    }

    public static List<String> getG() {
        List list = new ArrayList<>();
        list.add("g");
        list.add("G");
        return list;
    }

    public static List<String> getH() {
        List list = new ArrayList<>();
        list.add("h");
        list.add("H");
        return list;
    }

    public static List<String> getJ() {
        List list = new ArrayList<>();
        list.add("j");
        list.add("J");
        return list;
    }

    public static List<String> getK() {
        List list = new ArrayList<>();
        list.add("k");
        list.add("K");
        return list;
    }

    public static List<String> getL() {
        List list = new ArrayList<>();
        list.add("l");
        list.add("L");
        return list;
    }

    public static List<String> getSemiColon() {
        List list = new ArrayList<>();
        list.add(";");
        list.add(":");
        return list;
    }

    public static List<String> getApostrophe() {
        List list = new ArrayList<>();
        list.add("'");
        list.add("\"");
        return list;
    }

    public static List<String> getZ() {
        List list = new ArrayList<>();
        list.add("z");
        list.add("Z");
        return list;
    }

    public static List<String> getX() {
        List list = new ArrayList<>();
        list.add("x");
        list.add("X");
        return list;
    }

    public static List<String> getC() {
        List list = new ArrayList<>();
        list.add("c");
        list.add("C");
        return list;
    }

    public static List<String> getV() {
        List list = new ArrayList<>();
        list.add("v");
        list.add("V");
        return list;
    }

    public static List<String> getB() {
        List list = new ArrayList<>();
        list.add("b");
        list.add("B");
        return list;
    }

    public static List<String> getN() {
        List list = new ArrayList<>();
        list.add("n");
        list.add("N");
        return list;
    }

    public static List<String> getM() {
        List list = new ArrayList<>();
        list.add("m");
        list.add("M");
        return list;
    }

    public static List<String> getComma() {
        List list = new ArrayList<>();
        list.add(",");
        list.add("<");
        return list;
    }

    public static List<String> getDot() {
        List list = new ArrayList<>();
        list.add(".");
        list.add(">");
        return list;
    }

    public static List<String> getSlash() {
        List list = new ArrayList<>();
        list.add("/");
        list.add("?");
        return list;
    }

}
