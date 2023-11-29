package cmd_prompt;
import java.util.*;
public class deque {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
HashSet<Integer> hs = new HashSet();
Deque<Integer> queue = new ArrayDeque();
int size = sc.nextInt();
int window = sc.nextInt();
int max = -1;
//int arr[] = new int[size];
for(int i = 0;i<size;i++) {
	int input = sc.nextInt();
	queue.add(input);
	hs.add(input);
	
	if(queue.size() == window) {
		
		if(hs.size() > max) {
			max = hs.size();
		}
		int first = queue.remove();
		if(!queue.contains(first)) {
			hs.remove(first);
		}
	}
	
}
System.out.println(max);
	}

}
