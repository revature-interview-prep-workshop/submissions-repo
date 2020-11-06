package com.dsaa;

public class BinaryTreeImpl {

	private int key;

	private BinaryTreeImpl left, right;

	/**
	 * Simple constructor.
	 *
	 * @param key to set as key.
	 */
	public BinaryTreeImpl(int key) {
		this.key = key;
	}

	/**
	 * Extended constructor.
	 *
	 * @param key   to set as key.
	 * @param left  to set as left child.
	 * @param right to set as right child.
	 */
	public BinaryTreeImpl(int key, BinaryTreeImpl left, BinaryTreeImpl right) {
		this.key = key;
		setLeft(left);
		setRight(right);
	}

	public int getKey() {
		return key;
	}

	/**
	 * @return the left child.
	 */
	public BinaryTreeImpl getLeft() {
		return left;
	}

	/**
	 * @return the right child.
	 */
	public BinaryTreeImpl getRight() {
		return right;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}

	// Return a String representation of the BinaryTree using level order traversal
	public String toString() {
		int h = height(this);
		int i;
		String result = "";
		for (i = 1; i <= h; i++) {
			result += printGivenLevel(this, i);
		}
		return result;
	}

	// returns the number of nodes in the BinaryTree
	public int size() {
		return size(this);
	}

	public static int size(BinaryTreeImpl tree) {
		if (tree == null)
			return 0;
		return 1 + size(tree.getLeft()) + size(tree.getRight());
	}

	public int height() {
		return height(this);
	}

	public static int height(BinaryTreeImpl tree) {
		if (tree == null)
			return 0;
		int left = height(tree.getLeft());
		int right = height(tree.getRight());
		return Math.max(left, right) + 1;
	}

	public String printGivenLevel(BinaryTreeImpl root, int level) {
		if (root == null)
			return "";
		String result = "";
		if (level == 1) {
			result += root.getKey() + " ";
			return result;
		} else if (level > 1) {
			String left = printGivenLevel(root.left, level - 1);
			String right = printGivenLevel(root.right, level - 1);
			return left + right;
		} else {
			return "";
		}
	}

	/**
	 * @param left to set
	 */
	public void setLeft(BinaryTreeImpl left) {
		this.left = left;
	}

	/**
	 * @param right to set
	 */
	public void setRight(BinaryTreeImpl right) {
		this.right = right;
	}
}
