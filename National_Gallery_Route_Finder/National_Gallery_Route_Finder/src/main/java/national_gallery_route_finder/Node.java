package national_gallery_route_finder;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    public T data;
    public int nodeValue= Integer.MAX_VALUE;

    public List<Link> adjList = new ArrayList<>(); //Adjacency list now contains link objects = key!
    //Could use any concrete List implementation
    public Node(T data) {
        this.data=data;
    }

    public void connectToNodeDirected(Node<T> destNode, int cost) {
        adjList.add( new Link(destNode,cost) ); //Add new link object to source adjacency list
    }
    public void connectToNodeUndirected(Node<T> destNode, int cost) {
        adjList.add( new Link(destNode,cost) ); //Add new link object to source adjacency list
        destNode.adjList.add(new Link(this,cost)); //Add new link object to destination adjacency list
    }
}
