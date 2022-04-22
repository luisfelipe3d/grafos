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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GrafoTest {
    
    public GrafoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void expectTrueForAddingNewVertice() {
        Grafo grafo = new Grafo();
        Vertice vertice = new Vertice("1");
        Assert.assertTrue(grafo.addNewVertice(vertice));
    }

    @Test
    public void expectFalseForAddingNewVertice() {
        Grafo grafo = new Grafo();
        Vertice vertice = new Vertice("1");
        grafo.addNewVertice(vertice);
        Assert.assertFalse(grafo.addNewVertice(vertice));
    }

    @Test
    public void expectTrueForNewAresta() {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        grafo.addNewVertice(vertice1);
        grafo.addNewVertice(vertice2);
        Assert.assertTrue(grafo.addNewAresta(vertice1, vertice2));
    }

    @Test
    public void expectFalseForNewAresta() {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        grafo.addNewVertice(vertice1);
        Assert.assertFalse(grafo.addNewAresta(vertice1, vertice2));
    }

    @Test
    public void expectFalseForLoop() {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        grafo.addNewVertice(vertice1);
        grafo.addNewVertice(vertice2);
        Assert.assertFalse(grafo.addNewAresta(vertice1, vertice1));
    }

    @Test
    public void expectFalseForMultipleAresta() {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        grafo.addNewVertice(vertice1);
        grafo.addNewVertice(vertice2);
        grafo.addNewAresta(vertice1, vertice2);
        Assert.assertFalse(grafo.addNewAresta(vertice1, vertice2));
    }

    @Test
    public void expectSameSizeOfGraph() {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        grafo.addNewVertice(vertice1);
        grafo.addNewVertice(vertice2);

        Vertice vertice3 = new Vertice("3");
        Vertice vertice4 = new Vertice("4");
        grafo.addNewVertice(vertice3);
        grafo.addNewVertice(vertice4);

        Assert.assertEquals(4, grafo.getSize());
    }

    @Test
    public void expectSameSizeOfEdgesGraph() {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        grafo.addNewVertice(vertice1);
        grafo.addNewVertice(vertice2);

        Vertice vertice3 = new Vertice("3");
        Vertice vertice4 = new Vertice("4");
        grafo.addNewVertice(vertice3);
        grafo.addNewVertice(vertice4);

        grafo.addNewAresta(vertice1, vertice2);
        grafo.addNewAresta(vertice2, vertice3);
        grafo.addNewAresta(vertice3, vertice4);
        grafo.addNewAresta(vertice4, vertice1);

        Assert.assertEquals(4, grafo.getEdgesLenght());
    }

    @Test
    public void expectThreeEdgesOnNode() {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        Vertice vertice3 = new Vertice("3");
        Vertice vertice4 = new Vertice("4");

        grafo.addNewVertice(vertice1);
        grafo.addNewVertice(vertice2);
        grafo.addNewVertice(vertice3);
        grafo.addNewVertice(vertice4);

        grafo.addNewAresta(vertice1, vertice2);
        grafo.addNewAresta(vertice1, vertice3);
        grafo.addNewAresta(vertice1, vertice4);

        Assert.assertEquals(3, grafo.getNumberOfEdgesByNodeId("1"));
    }
    
}
