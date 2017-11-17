package gt.url.edu.demoestructuras.modelo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

import gt.url.edu.demoestructuras.graphviz.DemoGraphviz;
import gt.url.edu.demoestructuras.graphviz.FileLoader;
import gt.url.edu.demoestructuras.ordenamiento.DefaultComparator;
import gt.url.edu.demoestructuras.ordenamiento.IntComparator;
import gt.url.edu.demoestructuras.ordenamiento.MergeSorter;
import gt.url.edu.demoestructuras.ordenamiento.StringLengthComparator;

public class Main {

	public static void main(String[] args) throws IOException {
		FileLoader fileReader = new FileLoader();
		fileReader.loadFileWithJava8();
		
		fileReader.writeUsingFileWriter("Nos vemos a la salida");
		
	}
	

}
