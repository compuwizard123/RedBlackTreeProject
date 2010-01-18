import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.*;

public class TestingRemoval extends TestCase {
	
	private static int points = 0;

	
//////////////////////////test of primitive cases of removal
	
	public void testRemoveEmptyTree(){
		RedBlackTree<Integer> t = new RedBlackTree<Integer>();
		assertFalse(t.remove(10));
		points+=2;
	}
	
	public void testRemoveJustRoot(){
		RedBlackTree<Integer> t = new RedBlackTree<Integer>();
		assertTrue(t.insert(10));
		assertFalse(t.remove(20));
		assertTrue(t.iterator().hasNext());
		assertEquals(RedBlackTree.Color.BLACK, t.iterator().next().getColor());
		assertTrue(t.remove(10));
		assertFalse(t.iterator().hasNext());
		points+=5;
	}
	
	public void testRemoveSecondElementOrRoot(){
		// create test data
		RedBlackTree<Integer> t = new RedBlackTree<Integer>();
		t.insert(20);
		t.insert(10);
		System.out.println(t);
		t.remove(10);
		System.out.println(t);	
		t.insert(10);
		System.out.println(t);
		t.remove(20);
		System.out.println(t);
		t = new RedBlackTree<Integer>();
		t.insert(20);
		t.insert(10);
		System.out.println(t);
		t.remove(5);
		System.out.println(t);
		t.remove(15);
		System.out.println(t);
		t.remove(30);
		System.out.println(t);
		// do symmetric cases.

	}

	public void testRemoveRootInSmallTree(){
		RedBlackTree<Integer> b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		assertTrue(b.remove(20));
		
		ArrayList<Object> t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		ArrayList<Object> s = new ArrayList<Object>();
		s.add(10);
		s.add(30);
		
		Iterator<RedBlackTree.BinaryNode> it = b.iterator();
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}	
	}
//////////////////////////test of 2A cases of removal
	
	public void testRemove2A1(){
		//removal from an all black tree
		
		// test symmetric cases too.
	
		// remove leaf
		RedBlackTree<Integer> b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(40);
		b.insert(25);
		b.insert(25);
		b.insert(5);
		b.insert(5);
		//b.remove(40);
		b.remove(15);

		Iterator<RedBlackTree.BinaryNode> it = b.iterator();
		ArrayList<Object> t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		ArrayList<Object> s = new ArrayList<Object>();
		s.add(20);
		s.add(10);
		s.add(5);
		s.add(30);
		s.add(25);
		s.add(40);
		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
		
		
		
		// remove internal node
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(25);
		b.insert(40);
		b.insert(25);
		b.insert(5);
		b.insert(5);
		b.remove(10);
		it = b.iterator();
		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		
		s = new ArrayList<Object>();
		s.add(20);
		s.add(5);
		s.add(15);
		s.add(30);
		s.add(25);
		s.add(40);
		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
		
		
		
		// remove internal node
	b = new RedBlackTree<Integer>();
	b.insert(20);
	b.insert(10);
	b.insert(30);
	b.insert(5);
	b.insert(15);
	b.insert(25);
	b.insert(40);
	b.insert(2);
	b.insert(7);
	b.insert(7);
	b.insert(12);
	b.insert(17);
	b.insert(17);
	b.insert(17);
	
	b.insert(22);
	b.insert(27);

	b.insert(35);
	b.insert(47);
	
	b.insert(47);		
	b.insert(27);
	b.insert(27);
	b.insert(27);
	b.remove(10);
	
	it = b.iterator();
	t = new ArrayList<Object>();
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.RED);
	t.add(RedBlackTree.Color.RED);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.RED);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);
	t.add(RedBlackTree.Color.BLACK);		
	s = new ArrayList<Object>();
	s.add(20);
	s.add(7);
	s.add(5);
	s.add(2);
	s.add(15);
	s.add(12);
	s.add(17);
	s.add(30);
	s.add(25);
	s.add(22);
	s.add(27);
	s.add(40);
	s.add(35);
	s.add(47);
	
	for (int i = 0; i < s.size(); i++){
		RedBlackTree.BinaryNode temp = it.next();
		assertEquals(t.get(i), temp.getColor());
		assertEquals(s.get(i), temp.getElement());
	}

	
		// remove non-existing node
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(40);
		b.insert(25);
		b.insert(25);
		b.insert(5);
		b.insert(5);
		b.remove(17);

		it = b.iterator();
		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		s = new ArrayList<Object>();
		s.add(20);
		s.add(10);
		s.add(5);
		s.add(15);
		s.add(30);
		s.add(25);
		s.add(40);
		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
		
		//remove root
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(40);
		b.insert(25);
		b.insert(25);
		b.insert(5);
		b.insert(5);
		b.remove(20);

		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		s = new ArrayList<Object>();
		s.add(15);
		s.add(10);
		s.add(5);
		s.add(30);
		s.add(25);
		s.add(40);
		
		it = b.iterator();
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
	}
	

	public void testRemove2A3(){

		// Testing single rotation on left child
		RedBlackTree<Integer> b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(25);
		b.insert(40);
		b.insert(40);
		b.insert(5);
		b.insert(2);
		b.remove(15);

		Iterator<RedBlackTree.BinaryNode> it = b.iterator();
		ArrayList<Object> t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		ArrayList<Object> s = new ArrayList<Object>();
		s.add(20);
		s.add(5);
		s.add(2);
		s.add(10);
		s.add(30);
		s.add(25);
		s.add(40);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
		
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(25);
		b.insert(40);
		b.insert(40);
		b.insert(5);
		b.insert(45);

		b.remove(25);

		
		//testing single rotation with right child
		it = b.iterator();
		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		s = new ArrayList<Object>();
		s.add(20);
		s.add(10);
		s.add(5);
		s.add(15);
		s.add(40);
		s.add(30);
		s.add(45);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
	}
	
	public void testRemove2A2(){

		// Testing double rotation on left child
		RedBlackTree<Integer> b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(25);
		b.insert(40);
		b.insert(40);
		b.insert(5);
		b.insert(12);

		b.remove(5);

		
		Iterator<RedBlackTree.BinaryNode> it = b.iterator();
		ArrayList<Object> t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		ArrayList<Object> s = new ArrayList<Object>();
		s.add(20);
		s.add(12);
		s.add(10);
		s.add(15);
		s.add(30);
		s.add(25);
		s.add(40);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
		
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(25);
		b.insert(40);
		b.insert(40);
		b.insert(5);
		b.insert(27);

		b.remove(40);

		
		//testing double rotation with right child
		it = b.iterator();
		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		s = new ArrayList<Object>();
		s.add(20);
		s.add(10);
		s.add(5);
		s.add(15);
		s.add(27);
		s.add(25);
		s.add(30);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}
	}

	
////////////////////////  Test 2B cases of removal
	
	public void testRemove2B1(){
	
			// Testing 2B1 with right child
		    // the X to which we fall through is a leaf
			RedBlackTree<Integer> b = new RedBlackTree<Integer>();
			b.insert(20);
			b.insert(10);
			b.insert(30);
			b.insert(5);
			b.insert(15);
			b.insert(25);
			b.insert(40);
			b.insert(5);
			b.remove(15);

			Iterator<RedBlackTree.BinaryNode> it = b.iterator();
			ArrayList<Object> t = new ArrayList<Object>();
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.RED);
			ArrayList<Object> s = new ArrayList<Object>();
			s.add(20);
			s.add(10);
			s.add(5);
			s.add(30);
			s.add(25);
			s.add(40);		
			for (int i = 0; i < s.size(); i++){
				RedBlackTree.BinaryNode temp = it.next();
				assertEquals(t.get(i), temp.getColor());
				assertEquals(s.get(i), temp.getElement());
			}
	
			// Testing 2B1 with right child
		    // the X to which we fall through is not a leaf
			b = new RedBlackTree<Integer>();
			b.insert(20);
			b.insert(10);
			b.insert(30);
			b.insert(5);
			b.insert(15);
			b.insert(25);
			b.insert(40);
			b.insert(5);
			b.insert(17);

			b.remove(17);
			
			it = b.iterator();
			t = new ArrayList<Object>();
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.RED);
			s = new ArrayList<Object>();
			s.add(20);
			s.add(10);
			s.add(5);
			s.add(15);
			s.add(30);
			s.add(25);
			s.add(40);		
			for (int i = 0; i < s.size(); i++){
				RedBlackTree.BinaryNode temp = it.next();
				assertEquals(t.get(i), temp.getColor());
				assertEquals(s.get(i), temp.getElement());
			}

//			 Testing 2B1 with left child
//		     the X to which we fall through is a leaf
			b = new RedBlackTree<Integer>();
			b.insert(20);
			b.insert(10);
			b.insert(30);
			b.insert(5);
			b.insert(15);
			b.insert(25);
			b.insert(40);
			b.insert(40);
			b.remove(25);
			
			it = b.iterator();
			t = new ArrayList<Object>();
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.RED);
			s = new ArrayList<Object>();
			s.add(20);
			s.add(10);
			s.add(5);
			s.add(15);
			s.add(30);
			s.add(40);		
			for (int i = 0; i < s.size(); i++){
				RedBlackTree.BinaryNode temp = it.next();
				assertEquals(t.get(i), temp.getColor());
				assertEquals(s.get(i), temp.getElement());
			}
	
			// Testing 2B1 with left child
		    // the X to which we fall through is not a leaf
			b = new RedBlackTree<Integer>();
			b.insert(20);
			b.insert(10);
			b.insert(30);
			b.insert(5);
			b.insert(15);
			b.insert(25);
			b.insert(40);
			b.insert(40);
			b.insert(23);

			b.remove(23);
	
			it = b.iterator();
			t = new ArrayList<Object>();
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.RED);
			t.add(RedBlackTree.Color.BLACK);
			t.add(RedBlackTree.Color.BLACK);
			s = new ArrayList<Object>();
			s.add(20);
			s.add(10);
			s.add(5);
			s.add(15);
			s.add(30);
			s.add(25);
			s.add(40);		
			for (int i = 0; i < s.size(); i++){
				RedBlackTree.BinaryNode temp = it.next();
				assertEquals(t.get(i), temp.getColor());
				assertEquals(s.get(i), temp.getElement());
			}

	}
	
	
	public void testRemove2B2(){
		// Testing 2B2 with right child
		// removed node is a leaf
		RedBlackTree<Integer> b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(40);
		b.insert(5);
		b.remove(40);
	
		Iterator<RedBlackTree.BinaryNode> it = b.iterator();
		ArrayList<Object> t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		ArrayList<Object> s = new ArrayList<Object>();
		s.add(10);
		s.add(5);
		s.add(20);
		s.add(15);
		s.add(30);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}

		// Testing 2B2 with right child
		// removed node has one child
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(15);
		b.insert(40);
		b.insert(5);

		b.remove(30);
		
		it = b.iterator();
		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		s = new ArrayList<Object>();
		s.add(10);
		s.add(5);
		s.add(20);
		s.add(15);
		s.add(40);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}

//		 Testing 2B2 with left child
//	     removed node is a leaf
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(25);
		b.insert(40);
		b.insert(40);

		b.remove(5);
		
		it = b.iterator();
		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		s = new ArrayList<Object>();
		s.add(30);
		s.add(20);
		s.add(10);
		s.add(25);
		s.add(40);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}


//		 Testing 2B2 with left child
//	     removed node has one child
		b = new RedBlackTree<Integer>();
		b.insert(20);
		b.insert(10);
		b.insert(30);
		b.insert(5);
		b.insert(25);
		b.insert(40);
		b.insert(40);

		b.remove(10);
		
		it = b.iterator();
		t = new ArrayList<Object>();
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.RED);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		t.add(RedBlackTree.Color.BLACK);
		s = new ArrayList<Object>();
		s.add(30);
		s.add(20);
		s.add(5);
		s.add(25);
		s.add(40);		
		for (int i = 0; i < s.size(); i++){
			RedBlackTree.BinaryNode temp = it.next();
			assertEquals(t.get(i), temp.getColor());
			assertEquals(s.get(i), temp.getElement());
		}

	}
	


	public void testDoNothing(){
		System.out.println(points);
		//System.out.println("Recolor outside of single rotations.");
	}

	public static void main(String args[]) {
		junit.swingui.TestRunner.run(TestingRemoval.class);
	}
}


