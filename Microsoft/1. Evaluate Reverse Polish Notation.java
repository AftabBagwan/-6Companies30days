//Approach
//Ham values ek stack me daalte jayenge tab tak, jab tak hameing koi arithmetic operator nahi milta jab hame koi arithmetic operator milenga tab ham 2 value stack se pop karke eveluate kardenge aur wapas stack me push kar denge us value ko. same pure array ke liye chalta rahenga

class Solution {
    public int evalRPN(String[] tokens) {
        
        int a,b;
		Stack<Integer> stack = new Stack<Integer>();
        
		for (String str : tokens) {
			if(str.equals("+")) {
				stack.add(stack.pop()+stack.pop());
			}
			else if(str.equals("/")) {
				b = stack.pop();
				a = stack.pop();
				stack.add(a / b);
			}
			else if(str.equals("*")) {
				stack.add(stack.pop() * stack.pop());
			}
			else if(str.equals("-")) {
				b = stack.pop();
				a = stack.pop();
				stack.add(a - b);
			}
			else {
				stack.add(Integer.parseInt(str));
			}
		}	
		return stack.pop();
    }
}