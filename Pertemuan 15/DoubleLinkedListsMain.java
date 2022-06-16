public class DoubleLinkedListsMain {
    public static void main(String [] args) throws Exception{


        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1,2);
        graph.printGraph();


//        //Praktikum 1
//        DoubleLinkedLists dll = new DoubleLinkedLists();
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.addFirst(3);
//        dll.addLast(4);
//        dll.addFirst(7);
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.add(40, 1);
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.clear();
//        dll.print();
//        System.out.println("Size : " + dll.size());
//
//
//        //Praktikum 2
//        dll.addLast(50);
//        dll.addLast(40);
//        dll.addLast(10);
//        dll.addLast(20);
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.removeFirst();
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.removeLast();
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.remove(1);
//        dll.print();
//        System.out.println("Size : " + dll.size());
//
//
//        //Praktikum 3
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.addFirst(3);
//        dll.addLast(4);
//        dll.addFirst(7);
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        dll.add(40, 1);
//        dll.print();
//        System.out.println("Size : " + dll.size());
//        System.out.println("================================================");
//        System.out.println("Data Awal Pada Linked Lists Adalah : " + dll.getFirst());
//        System.out.println("Data Akhir Pada Linked Lists Adalah : " + dll.getLast());
//        System.out.println("Datta Indeks ke-1 Pada Linked Lists Adalah : " + dll.get(1));
//


    }

}
