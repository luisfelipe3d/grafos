/*
 * Copyright (C) 2022 liraline
 * Copyright (C) 2022 luisfelipe3d
 * Copyright (C) 2022 m1lhous3
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

package main;

public class Aresta {

  private Vertice vertice1;
  private Vertice vertice2;

  public Aresta(Vertice vertice1, Vertice vertice2){
    this.vertice1 = vertice1;
    this.vertice2 = vertice2;
  }

  public Vertice getVertice1() {
    return vertice1;
  }

  public Vertice getVertice2() {
    return vertice2;
  }

}
