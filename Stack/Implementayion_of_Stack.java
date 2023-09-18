class Stack{
	private int[] arr = new int[5];
	private int idx = 0;
	
	void push(int x){
		arr[idx] = x;
		idx++;
	}
	int peek(){
		if(idx == 0){
			System.out.println("Stack is Empty");
		}
		return arr[idx-1];
	}
	int pop(){
		if(idx == 0){
			System.out.println("Stack is Empty");
		}
		int top = arr[idx-1];
		arr[idx-1] = 0;
		idx--;
		return top;
	}
	void display(){
		for (int i = 0; i < idx; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	int size(){
		return idx;
	}
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.display();
		st.pop();
		st.display();
		System.out.println(st.peek());
	}
}