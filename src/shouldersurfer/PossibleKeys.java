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

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Max 'Libra' Kersten
 */
public class PossibleKeys {

    public static Map<String, HashSet<String>> getAllKeys() {
        Map<String, HashSet<String>> map = new HashMap<>();
        map.put("`", getMappingBacktick());
        map.put("~", getMappingBacktick());
        map.put("1", getMapping1());
        map.put("!", getMapping1());
        map.put("2", getMapping2());
        map.put("@", getMapping2());
        map.put("3", getMapping3());
        map.put("#", getMapping3());
        map.put("4", getMapping4());
        map.put("$", getMapping4());
        map.put("5", getMapping5());
        map.put("%", getMapping5());
        map.put("6", getMapping6());
        map.put("^", getMapping6());
        map.put("7", getMapping7());
        map.put("&", getMapping7());
        map.put("8", getMapping8());
        map.put("*", getMapping8());
        map.put("9", getMapping9());
        map.put("(", getMapping9());
        map.put("0", getMapping0());
        map.put(")", getMapping0());
        map.put("-", getMappingDash());
        map.put("_", getMappingDash());
        map.put("=", getMappingEquals());
        map.put("+", getMappingEquals());

        map.put("q", getMappingQ());
        map.put("w", getMappingW());
        map.put("e", getmappingE());
        map.put("r", getMappingR());
        map.put("t", getMappingT());
        map.put("y", getMappingY());
        map.put("u", getMappingU());
        map.put("i", getMappingI());
        map.put("o", getMappingO());
        map.put("p", getMappingP());
        map.put("[", getMappingBracketOpen());
        map.put("{", getMappingBracketOpen());
        map.put("]", getmappingBrackedClose());
        map.put("}", getmappingBrackedClose());
        map.put("\\", getmappingBackSlash());
        map.put("|", getmappingBackSlash());

        map.put("a", getMappingA());
        map.put("s", getMappingS());
        map.put("d", getMappingD());
        map.put("f", getMappingF());
        map.put("g", getMappingG());
        map.put("h", getMappingH());
        map.put("j", getMappingJ());
        map.put("k", getMappingK());
        map.put("l", getMappingL());
        map.put(";", getMappingSemiColon());
        map.put(":", getMappingSemiColon());
        map.put("'", getMappingApostrophe());
        map.put("\"", getMappingApostrophe());

        map.put("z", getMappingZ());
        map.put("x", getMappingX());
        map.put("c", getMappingC());
        map.put("v", getMappingV());
        map.put("b", getMappingB());
        map.put("n", getMappingN());
        map.put("m", getMappingM());
        map.put(",", getMappingComma());
        map.put("<", getMappingComma());
        map.put(".", getMappingDot());
        map.put(">", getMappingDot());
        map.put("/", getMappingSlash());
        map.put("?", getMappingSlash());
        return map;
    }

    private static HashSet<String> getMappingBacktick() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getBacktick());
        list.addAll(Library.get1());
        list.addAll(Library.getQ());
        return list;
    }

    private static HashSet<String> getMapping1() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getBacktick());
        list.addAll(Library.get1());
        list.addAll(Library.get2());
        list.addAll(Library.getQ());
        list.addAll(Library.getW());
        return list;
    }

    private static HashSet<String> getMapping2() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get1());
        list.addAll(Library.get2());
        list.addAll(Library.get3());
        list.addAll(Library.getQ());
        list.addAll(Library.getW());
        list.addAll(Library.getE());
        return list;
    }

    private static HashSet<String> getMapping3() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get2());
        list.addAll(Library.get3());
        list.addAll(Library.get4());
        list.addAll(Library.getW());
        list.addAll(Library.getE());
        list.addAll(Library.getR());
        return list;
    }

    private static HashSet<String> getMapping4() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get3());
        list.addAll(Library.get4());
        list.addAll(Library.get5());
        list.addAll(Library.getW());
        list.addAll(Library.getE());
        list.addAll(Library.getR());
        list.addAll(Library.getT());
        return list;
    }

    private static HashSet<String> getMapping5() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get4());
        list.addAll(Library.get5());
        list.addAll(Library.get6());
        list.addAll(Library.getE());
        list.addAll(Library.getR());
        list.addAll(Library.getT());
        list.addAll(Library.getY());
        return list;
    }

    private static HashSet<String> getMapping6() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get5());
        list.addAll(Library.get6());
        list.addAll(Library.get7());
        list.addAll(Library.getR());
        list.addAll(Library.getT());
        list.addAll(Library.getY());
        list.addAll(Library.getU());
        return list;
    }

    private static HashSet<String> getMapping7() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get6());
        list.addAll(Library.get7());
        list.addAll(Library.get8());
        list.addAll(Library.getT());
        list.addAll(Library.getY());
        list.addAll(Library.getU());
        list.addAll(Library.getI());
        return list;
    }

    private static HashSet<String> getMapping8() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get7());
        list.addAll(Library.get8());
        list.addAll(Library.get9());
        list.addAll(Library.getY());
        list.addAll(Library.getU());
        list.addAll(Library.getI());
        list.addAll(Library.getO());
        return list;
    }

    private static HashSet<String> getMapping9() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get8());
        list.addAll(Library.get9());
        list.addAll(Library.get0());
        list.addAll(Library.getU());
        list.addAll(Library.getI());
        list.addAll(Library.getO());
        list.addAll(Library.getP());
        return list;
    }

    private static HashSet<String> getMapping0() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get9());
        list.addAll(Library.get0());
        list.addAll(Library.getDash());
        list.addAll(Library.getI());
        list.addAll(Library.getO());
        list.addAll(Library.getP());
        list.addAll(Library.getBracketOpen());
        return list;
    }

    private static HashSet<String> getMappingDash() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get0());
        list.addAll(Library.getDash());
        list.addAll(Library.getPlus());
        list.addAll(Library.getO());
        list.addAll(Library.getP());
        list.addAll(Library.getBracketOpen());
        list.addAll(Library.getBracketClose());
        return list;
    }

    private static HashSet<String> getMappingEquals() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getDash());
        list.addAll(Library.getP());
        list.addAll(Library.getBracketOpen());
        list.addAll(Library.getBracketClose());
        list.addAll(Library.getPipe());
        list.addAll(Library.getPlus());
        return list;
    }

    private static HashSet<String> getMappingQ() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getBacktick());
        list.addAll(Library.get1());
        list.addAll(Library.get2());
        list.addAll(Library.getQ());
        list.addAll(Library.getW());
        list.addAll(Library.getS());
        list.addAll(Library.getA());
        return list;
    }

    private static HashSet<String> getMappingW() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get1());
        list.addAll(Library.get2());
        list.addAll(Library.get3());
        list.addAll(Library.getQ());
        list.addAll(Library.getW());
        list.addAll(Library.getE());
        list.addAll(Library.getA());
        list.addAll(Library.getS());
        list.addAll(Library.getD());
        return list;
    }

    private static HashSet<String> getmappingE() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get2());
        list.addAll(Library.get3());
        list.addAll(Library.get4());
        list.addAll(Library.getW());
        list.addAll(Library.getE());
        list.addAll(Library.getR());
        list.addAll(Library.getS());
        list.addAll(Library.getD());
        list.addAll(Library.getF());
        return list;
    }

    private static HashSet<String> getMappingR() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get3());
        list.addAll(Library.get4());
        list.addAll(Library.get5());
        list.addAll(Library.getE());
        list.addAll(Library.getR());
        list.addAll(Library.getT());
        list.addAll(Library.getD());
        list.addAll(Library.getF());
        list.addAll(Library.getG());
        return list;
    }

    private static HashSet<String> getMappingT() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get4());
        list.addAll(Library.get5());
        list.addAll(Library.get6());
        list.addAll(Library.getR());
        list.addAll(Library.getT());
        list.addAll(Library.getY());
        list.addAll(Library.getF());
        list.addAll(Library.getG());
        list.addAll(Library.getH());
        return list;
    }

    private static HashSet<String> getMappingY() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get5());
        list.addAll(Library.get6());
        list.addAll(Library.get7());
        list.addAll(Library.getT());
        list.addAll(Library.getY());
        list.addAll(Library.getU());
        list.addAll(Library.getG());
        list.addAll(Library.getH());
        list.addAll(Library.getJ());
        return list;
    }

    private static HashSet<String> getMappingU() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get6());
        list.addAll(Library.get7());
        list.addAll(Library.get8());
        list.addAll(Library.getY());
        list.addAll(Library.getU());
        list.addAll(Library.getI());
        list.addAll(Library.getH());
        list.addAll(Library.getJ());
        list.addAll(Library.getK());
        return list;
    }

    private static HashSet<String> getMappingI() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get7());
        list.addAll(Library.get8());
        list.addAll(Library.get9());
        list.addAll(Library.getU());
        list.addAll(Library.getI());
        list.addAll(Library.getO());
        list.addAll(Library.getJ());
        list.addAll(Library.getK());
        list.addAll(Library.getL());
        return list;
    }

    private static HashSet<String> getMappingO() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get8());
        list.addAll(Library.get9());
        list.addAll(Library.get0());
        list.addAll(Library.getI());
        list.addAll(Library.getO());
        list.addAll(Library.getP());
        list.addAll(Library.getK());
        list.addAll(Library.getL());
        list.addAll(Library.getSemiColon());
        return list;
    }

    private static HashSet<String> getMappingP() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get9());
        list.addAll(Library.get0());
        list.addAll(Library.getDash());
        list.addAll(Library.getO());
        list.addAll(Library.getP());
        list.addAll(Library.getBracketOpen());
        list.addAll(Library.getL());
        list.addAll(Library.getSemiColon());
        list.addAll(Library.getApostrophe());
        return list;
    }

    private static HashSet<String> getMappingBracketOpen() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.get0());
        list.addAll(Library.getDash());
        list.addAll(Library.getPlus());
        list.addAll(Library.getP());
        list.addAll(Library.getBracketOpen());
        list.addAll(Library.getBracketClose());
        list.addAll(Library.getSemiColon());
        list.addAll(Library.getApostrophe());
        return list;
    }

    private static HashSet<String> getmappingBrackedClose() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getDash());
        list.addAll(Library.getPlus());
        list.addAll(Library.getBracketClose());
        list.addAll(Library.getBracketOpen());
        list.addAll(Library.getPipe());
        list.addAll(Library.getApostrophe());
        return list;
    }

    private static HashSet<String> getmappingBackSlash() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getPlus());
        list.addAll(Library.getBracketClose());
        list.addAll(Library.getPipe());
        return list;
    }

    private static HashSet<String> getMappingA() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getQ());
        list.addAll(Library.getW());
        list.addAll(Library.getS());
        list.addAll(Library.getA());
        list.addAll(Library.getX());
        list.addAll(Library.getZ());
        return list;
    }

    private static HashSet<String> getMappingS() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getQ());
        list.addAll(Library.getW());
        list.addAll(Library.getE());
        list.addAll(Library.getA());
        list.addAll(Library.getS());
        list.addAll(Library.getD());
        list.addAll(Library.getZ());
        list.addAll(Library.getX());
        list.addAll(Library.getC());
        return list;
    }

    private static HashSet<String> getMappingD() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getW());
        list.addAll(Library.getE());
        list.addAll(Library.getR());
        list.addAll(Library.getS());
        list.addAll(Library.getD());
        list.addAll(Library.getF());
        list.addAll(Library.getX());
        list.addAll(Library.getC());
        list.addAll(Library.getV());
        return list;
    }

    private static HashSet<String> getMappingF() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getE());
        list.addAll(Library.getR());
        list.addAll(Library.getT());
        list.addAll(Library.getD());
        list.addAll(Library.getF());
        list.addAll(Library.getG());
        list.addAll(Library.getC());
        list.addAll(Library.getV());
        list.addAll(Library.getB());
        return list;
    }

    private static HashSet<String> getMappingG() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getR());
        list.addAll(Library.getT());
        list.addAll(Library.getY());
        list.addAll(Library.getF());
        list.addAll(Library.getG());
        list.addAll(Library.getH());
        list.addAll(Library.getV());
        list.addAll(Library.getB());
        list.addAll(Library.getN());
        return list;
    }

    private static HashSet<String> getMappingH() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getT());
        list.addAll(Library.getY());
        list.addAll(Library.getU());
        list.addAll(Library.getG());
        list.addAll(Library.getH());
        list.addAll(Library.getJ());
        list.addAll(Library.getB());
        list.addAll(Library.getN());
        list.addAll(Library.getM());
        return list;
    }

    private static HashSet<String> getMappingJ() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getY());
        list.addAll(Library.getU());
        list.addAll(Library.getI());
        list.addAll(Library.getH());
        list.addAll(Library.getJ());
        list.addAll(Library.getK());
        list.addAll(Library.getN());
        list.addAll(Library.getM());
        list.addAll(Library.getComma());
        return list;
    }

    private static HashSet<String> getMappingK() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getU());
        list.addAll(Library.getI());
        list.addAll(Library.getO());
        list.addAll(Library.getJ());
        list.addAll(Library.getK());
        list.addAll(Library.getL());
        list.addAll(Library.getM());
        list.addAll(Library.getComma());
        list.addAll(Library.getDot());
        return list;
    }

    private static HashSet<String> getMappingL() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getI());
        list.addAll(Library.getO());
        list.addAll(Library.getP());
        list.addAll(Library.getK());
        list.addAll(Library.getL());
        list.addAll(Library.getSemiColon());
        list.addAll(Library.getComma());
        list.addAll(Library.getDot());
        list.addAll(Library.getSlash());
        return list;
    }

    private static HashSet<String> getMappingSemiColon() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getO());
        list.addAll(Library.getP());
        list.addAll(Library.getBracketOpen());
        list.addAll(Library.getL());
        list.addAll(Library.getSemiColon());
        list.addAll(Library.getApostrophe());
        list.addAll(Library.getDot());
        list.addAll(Library.getSlash());
        return list;
    }

    private static HashSet<String> getMappingApostrophe() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getP());
        list.addAll(Library.getBracketOpen());
        list.addAll(Library.getBracketClose());
        list.addAll(Library.getSemiColon());
        list.addAll(Library.getApostrophe());
        list.addAll(Library.getSlash());
        return list;
    }

    private static HashSet<String> getMappingZ() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getA());
        list.addAll(Library.getS());
        list.addAll(Library.getX());
        list.addAll(Library.getZ());
        return list;
    }

    private static HashSet<String> getMappingX() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getA());
        list.addAll(Library.getS());
        list.addAll(Library.getD());
        list.addAll(Library.getZ());
        list.addAll(Library.getX());
        list.addAll(Library.getC());
        return list;
    }

    private static HashSet<String> getMappingC() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getS());
        list.addAll(Library.getD());
        list.addAll(Library.getF());
        list.addAll(Library.getX());
        list.addAll(Library.getC());
        list.addAll(Library.getV());
        return list;
    }

    private static HashSet<String> getMappingV() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getD());
        list.addAll(Library.getF());
        list.addAll(Library.getG());
        list.addAll(Library.getC());
        list.addAll(Library.getV());
        list.addAll(Library.getB());
        return list;
    }

    private static HashSet<String> getMappingB() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getF());
        list.addAll(Library.getG());
        list.addAll(Library.getH());
        list.addAll(Library.getV());
        list.addAll(Library.getB());
        list.addAll(Library.getN());
        return list;
    }

    private static HashSet<String> getMappingN() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getG());
        list.addAll(Library.getH());
        list.addAll(Library.getJ());
        list.addAll(Library.getB());
        list.addAll(Library.getN());
        list.addAll(Library.getM());
        return list;
    }

    private static HashSet<String> getMappingM() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getH());
        list.addAll(Library.getJ());
        list.addAll(Library.getK());
        list.addAll(Library.getN());
        list.addAll(Library.getM());
        list.addAll(Library.getComma());
        return list;
    }

    private static HashSet<String> getMappingComma() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getJ());
        list.addAll(Library.getK());
        list.addAll(Library.getL());
        list.addAll(Library.getM());
        list.addAll(Library.getComma());
        list.addAll(Library.getDot());
        return list;
    }

    private static HashSet<String> getMappingDot() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getK());
        list.addAll(Library.getL());
        list.addAll(Library.getSemiColon());
        list.addAll(Library.getComma());
        list.addAll(Library.getDot());
        list.addAll(Library.getSlash());
        return list;
    }

    private static HashSet<String> getMappingSlash() {
        HashSet<String> list = new HashSet<>();
        list.addAll(Library.getSemiColon());
        list.addAll(Library.getApostrophe());
        list.addAll(Library.getDot());
        list.addAll(Library.getSlash());
        return list;
    }
}
