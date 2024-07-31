import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 Stack 생성
        Stack<Integer> stack = new Stack<>();
        
        // 배열의 각 요소를 순회
        for (int i = 0; i < arr.length; i++) {
            
            // 현재 스택의 최상단 원소가 배열의 현재 원소보다 크거나 같으면 스택에서 제거
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            
            // 스택이 비어있으면 현재 원소를 스택에 추가
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }
            // 현재 원소가 스택의 최상단 원소보다 클 경우 스택에 추가
            else if (stack.peek() < arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        // 결과 배열을 스택의 크기로 초기화
        int[] result = new int[stack.size()];
        
        // 스택에서 원소를 꺼내어 결과 배열에 저장 (스택은 LIFO 구조이므로 역순으로 저장됨)
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}