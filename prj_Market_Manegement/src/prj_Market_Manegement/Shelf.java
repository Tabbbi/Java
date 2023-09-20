package prj_Market_Manegement;

import java.util.*;

public class Shelf {
	private Object[][] shelf;

	public Shelf(int pRows, int pPositions) {
        this.shelf = new Object[pRows][pPositions];
    }

    public void addProductStack(int pRow, int pPosition, Product pProductStack) {
        this.shelf[pRow][pPosition] = new Stack<Product>();
    }

    @SuppressWarnings("unchecked")
	public void addItemToStack(int pRow, int pPosition, Product pProduct) {
        ((Stack<Product>) this.shelf[pRow][pPosition]).push(pProduct);
    }
    
    public void removeProductStack(int pRow, int pPosition) {
        this.shelf[pRow][pPosition] = null;
    }
    
    @SuppressWarnings("unchecked")
    public void removeItemFromStack(int pRow, int pPosition) {
        try {
            ((Stack<Product>) this.shelf[pRow][pPosition]).pop();
        } catch(EmptyStackException e) {
            System.out.println("Stack is empty");
        }
    }

    @SuppressWarnings("unchecked")
	public void isStackEmpty(int pRow, int pPosition) {
        if (((Stack<Product>) this.shelf[pRow][pPosition]).isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void isShelfplaceEmpty(int pRow, int pPosition) {
        if (this.shelf[pRow][pPosition] == null) {
            System.out.println("Shelfplace is empty");
        } else {
            System.out.println("Shelfplace is not empty");
        }
    }




    @SuppressWarnings("unchecked")
	public void show() {
        for (int i = 0; i < this.shelf.length; i++) {
            for (int j = 0; j < this.shelf[i].length; j++) {
                if (this.shelf[i][j] != null) {
                    System.out.println("Row: " + (i + 1));
                    System.out.println("Position: " + (j + 1));
                    if (((Stack<Product>) this.shelf[i][j]).isEmpty()) {
                        System.out.println("No products in stock");
                    } else {
                        System.out.print("Amount of " + ((Stack<Product>) this.shelf[i][j]).peek().getName() + " : ");
                        System.out.println(((Stack<Product>) this.shelf[i][j]).size());
                    }
                }
            }
        }
    }
}