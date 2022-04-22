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

import java.util.ArrayList;
import java.util.List;

public class Grafo {
  private List<Vertice> vertices;
  private List<Aresta> arestas;

  public Grafo(){
    this.vertices = new ArrayList<>();
    this.arestas = new ArrayList<>();
  }

  public boolean addNewVertice(Vertice vertice) {
    if (isVerticeOnGrafo(vertice)){
      return false;
    }else{
      return this.vertices.add(vertice);
    }
  }

  private boolean isVerticeOnGrafo(Vertice vertice){
    return this.vertices.contains(vertice);
  }

  public boolean addNewAresta(Vertice vertice1, Vertice vertice2) {
    if (isVerticeOnGrafo(vertice1) && isVerticeOnGrafo(vertice2)
        && vertice1.getId() != vertice2.getId() &&
        !isEdgeAlreadyOnGraph(vertice1, vertice2)){
      return this.arestas.add(new Aresta(vertice1, vertice2));
    }
    return false;
  }

  private boolean isEdgeAlreadyOnGraph(Vertice vertice1, Vertice vertice2){
    for(Aresta aresta: this.arestas){
      if (aresta.getVertice1().getId() == vertice1.getId() &&
          aresta.getVertice2().getId() == vertice2.getId()){
        return true;
      }
    }
    return false;
  }

  public int getSize() {
    return this.vertices.size();
  }

  public int getEdgesLenght() {
    return this.arestas.size();
  }

  public int getNumberOfEdgesByNodeId(String nodeId) {
    int count = 0;
    for(Aresta aresta: arestas){
      if(aresta.getVertice1().getId() == nodeId ||
          aresta.getVertice2().getId() == nodeId){
        count++;
      }
    }
    return count;
  }
}
