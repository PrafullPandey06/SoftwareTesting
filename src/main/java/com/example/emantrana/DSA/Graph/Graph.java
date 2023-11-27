package com.example.emantrana.DSA.Graph;


import java.util.ArrayList;

public class Graph {

   public class AdjacencyListGraph<E extends Comparable<E>> {

        ArrayList<Vertex> vertices;

        public AdjacencyListGraph() {
            vertices = new ArrayList<>();
        }

        private class Vertex {

            E data;
            ArrayList<Vertex> adjacentVertices;

            public Vertex(E data) {
                adjacentVertices = new ArrayList<>();
                this.data = data;
            }

            public boolean addAdjacentVertex(Vertex to) {
                for (Vertex v : adjacentVertices) {
                    if (v.data.compareTo(to.data) == 0) {
                        return false;
                    }
                }
                return adjacentVertices.add(to);
            }

            public boolean removeAdjacentVertex(E to) {

                for (int i = 0; i < adjacentVertices.size(); i++) {
                    if (adjacentVertices.get(i).data.compareTo(to) == 0) {
                        adjacentVertices.remove(i);
                        return true;
                    }
                }
                return false;
            }
        }
       public boolean removeVertex(E data) {
           Vertex vertexToRemove = null;

           for (Vertex v : vertices) {
               if (v.data.equals(data)) {
                   vertexToRemove = v;
                   break;
               }
           }

           if (vertexToRemove == null) {
               return false;
           }

           vertices.remove(vertexToRemove);


           for (Vertex v : vertices) {
               v.removeAdjacentVertex(data);
           }

           return true;
       }

       public boolean removeEdge(E from, E to) {
            Vertex fromV = null;
            for (Vertex v : vertices) {
                if (from.compareTo(v.data) == 0) {
                    fromV = v;
                    break;
                }
            }
            if (fromV == null) {
                return false;
            }
            return fromV.removeAdjacentVertex(to);
        }

        public boolean addEdge(E from, E to) {
            Vertex fromV = null, toV = null;
            for (Vertex v : vertices) {
                if (from.compareTo(v.data) == 0) {
                    fromV = v;
                } else if (to.compareTo(v.data) == 0) {
                    toV = v;
                }
                if (fromV != null && toV != null) {
                    break;
                }
            }
            if (fromV == null) {
                fromV = new Vertex(from);
                vertices.add(fromV);
            }
            if (toV == null) {
                toV = new Vertex(to);
                vertices.add(toV);
            }
            return fromV.addAdjacentVertex(toV);
        }

         public boolean addVertex(E data) {
                for (Vertex v : vertices) {
                 if (v.data.compareTo(data) == 0) {
                      return false;
                 }
                }
                return vertices.add(new Vertex(data));
          }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Vertex v : vertices) {
                sb.append("Vertex: ");
                sb.append(v.data);
                sb.append("\n");
                sb.append("Adjacent vertices: ");
                for (Vertex v2 : v.adjacentVertices) {
                    sb.append(v2.data);
                    sb.append(" ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }

}
