class SafeQueue<T>{
	Queue<T> queue;
	public void push(T t){
		mutex.acquire();
		queue.push(t);
		mutex.release();
	}

	public void pop(){
		mutex.acquire();
		queue.pop();
		mutex.release();
	}
	
	public boolean isEmpty(){
		mutex.acquire();
		boolean flag = queue.isEmpty();
		mutex.release();
		return flag;
	}
}
