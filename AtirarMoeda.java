/*
 * Copyright (C) 2020 Fernando Isnaldo Silva de Faria
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

/**
 *
 * @author Fernando Isnaldo Silva de Faria
 */
import java.util.Random;
import javax.swing.*;
public class AtirarMoeda {
    /**
     * @param args ignorado
     */
    public static void main(String[] args) {
        Random real = new Random();
        JOptionPane.showMessageDialog(null, "Clique OK para disparar moeda.");
        if ((real.nextLong()) < 0) {
            JOptionPane.showMessageDialog(null, "Cara!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Coroa!");
        }
       System.exit(0);
    }
}
