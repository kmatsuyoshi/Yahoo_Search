/*
  Team Yahoo Search -- Bing Li, Lily Yan, Selina Zou
  APCS2 pd1
  Lab 02
  2018-04-18
*/

public class QQKchDriver {
    public static void main(String[] args) {
	QQKachoo<String> mister = new QQKachoo<String>();
	QQKachoo<String> mrs = new QQKachoo<String>(8);

	System.out.println("\nEnqueueing deque mister...");

	System.out.println("Element added successfully: " + mister.offerLast("and"));
	System.out.println("Element added successfully: " + mister.offerLast("there's"));
	System.out.println("Element added successfully: " + mister.offerLast("nobody"));
	System.out.println("Element added successfully: " + mister.offerLast("around"));

	System.out.println("Element added successfully: " + mister.offerFirst("forest"));
	System.out.println("Element added successfully: " + mister.offerFirst("a"));
	System.out.println("Element added successfully: " + mister.offerFirst("in"));
	System.out.println("Element added successfully: " + mister.offerFirst("falling"));
	System.out.println("Element added successfully: " + mister.offerFirst("you're"));
	System.out.println("Element added successfully: " + mister.offerFirst("when"));
	System.out.println("\nmister after enqueing: " + mister);

	
	System.out.println("\nEnqueueing deque mrs...");

	System.out.println("Element added successfully: " + mrs.offerLast("peck"));
	System.out.println("Element added successfully: " + mrs.offerLast("of"));
	System.out.println("Element added successfully: " + mrs.offerLast("pickled"));
	System.out.println("Element added successfully: " + mrs.offerLast("peppers"));

	System.out.println("Element added successfully: " + mrs.offerFirst("a"));
	System.out.println("Element added successfully: " + mrs.offerFirst("picked"));
	System.out.println("Element added successfully: " + mrs.offerFirst("Piper"));
	System.out.println("Element added successfully: " + mrs.offerFirst("Peter"));
	System.out.println("Element added successfully: " + mrs.offerFirst("random"));
	System.out.println("Element added successfully: " + mrs.offerLast("thing"));

	System.out.println("\nmrs after enqueing: " + mrs);

	System.out.println("\n\nDequeueing mister: ");
	while (mister._size > 0) {
	    int firstOrLast = (int)(Math.random() * 2); //determines whether to remove element at front or end of deque
	    if (firstOrLast == 0) { 
		System.out.println("\nRemoving element at FRONT of deque...");
		System.out.println("Element at front: " + mister.peekFirst());
		System.out.println("Element removed: " + mister.pollFirst());
	    }

	    else {
	        System.out.println("\nRemoving element at END of deque...");
		System.out.println("Element at end: " + mister.peekLast());
		System.out.println("Element removed: " + mister.pollLast());
	    }

	    System.out.println("Deque after dequeue: " + mister);
	}	   
	/* ~~~~~~~~~~~~MOVE ME DOWN~~~~~~~~~~~~~
	   ~~~~~~~~~~~~YOU MADE IT~~~~~~~~~~~~~~~ */
    }
}
