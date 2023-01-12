// 2235. Add Two Integers
class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

// bài tập về nhà buổi 1
// 2469. Convert the Temperature
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius*1.80 + 32.00;
        double ans[] = {kelvin,fahrenheit};
        return ans;
    }
}
// 1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            ans[i]=nums[a];
        }
        return ans;
    }
}
//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if((target-nums[j])==nums[i]){
                        return new int[]{i,j};
                    }
                }
            }
            return null;
    }
}
//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i < nums.length; i++){
            int a = target - nums[i];
            Integer b =  map.get(a);
            if(b != null){
                return new int[]{i,b};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
//136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int a = 0;
            for(int j= 0; j < nums.length; j++){
               if(nums[i] == nums[j]){
                   a++;
               } 
           }
            if (a == 1){
                return nums[i];
            } 
        }
        return 0;
    }
}
//136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
            for(int i : nums) {
                if(set.contains(i)) {
                    set.remove(i);
                } else {
                    set.add(i);
                }
            }
            return set.iterator().next();
    }
}
// 1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
         int a = 0;
        for(int i = 0; i < nums.length; i++) {
            int b = nums[i];
            int check = 0;
            while(b>0) {
                b = b/10;
                check++;
            }
            if(check % 2 == 0) {
                a++;
            }
        }
        return a;
    }
}
// 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //1. lay tung phan tu mang 2
        for(int j = 0; j < n; j++){
            //2 tim vi tri chen mang 1
            int i = 0;
            while(i < m && nums1[i] < nums2[j]){
                i++;
            } 
            // chen
            for(int u = m; u > i; u--){
                nums1[u] = nums1[u-1];
            }
            nums1[i] = nums2[j];
            m++;
        }
    }
}
// 27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int a = nums.length;
        for(int i = 0; i < a; i++){
            if(nums[i] == val){
                nums[i] = nums[a - 1];
                i--;
                a--;
            }
        }
    return a;
    }
}
// bài tập về nhà buổi 2
// 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        int sumNums = 0;
        int runningSums[] = new int [nums.length];
        for (int i= 0; i < nums.length; i++){
            sumNums += nums[i];
            runningSums[i] = sumNums;
        }
        return runningSums;
    }
}
// 387. First Unique Character in a String
// bị Time Limit Exceeded
class Solution {
    public int firstUniqChar(String s) {
        int nums[] = new int[s.length()];
        int len = nums.length;
        for(int i = 0; i < s.length(); i++){
            nums[i] = s.charAt(i);
        }
        for(int i = 0; i < nums.length; i++){
            int a = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    a++;
                }
            }
            if(a == 1){
                return i;
            }
        }
    return -1;
    }
}
// 387. First Unique Character in a String
class Solution {
    public int firstUniqChar(String s) {
            String newString = s;
            while(s.length() > 0)
            {
                int curLength = s.length();
                String first = String.valueOf(s.charAt(0));
                s = s.replaceAll(first, "");
                if(s.length() == curLength - 1)
                    return newString.indexOf(first);
            }
            return -1;
    }
}
// 283. Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++){
           for(int j = i+1; j < nums.length; j++){
               if(nums[i] == 0 && nums[j] !=0){
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
        }
    }
}
//   Bài Tập Về Nhà Buổi 3
// 217. Contains Duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        Arrays.sort(nums);
        int check = -1;
        for(int i : nums){
            if(i != check){
                check = i;
            } else {
                return true;
            }
        }
    return false;
    }
}
// 1051. Height Checker
class Solution {
    public int heightChecker(int[] heights) {
        int nums[] = heights.clone();
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(heights[i] != nums[i]){
                ans++;
            }
        }
        return ans;
    }
}
// Bài Tập về nhà Buổi 4
// 342. Power of Four
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0 || n % 2 != 0) return false;
        double temp = n/4.0;
        if (temp % 1 != 0) return false;
        return isPowerOfFour((int)temp);
    }
}
// 394. Decode String
// ngăn xếp Stack
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = (k * 10) + (c - '0');
                continue;
            }
            if (c == '[') {
                numStack.push(k);
                k = 0;
                stringStack.push(String.valueOf(c));
                continue;
            }
            if (c != ']') {
                stringStack.push(String.valueOf(c));
                continue;
            }
            StringBuilder temp = new StringBuilder();
            while (!stringStack.peek().equals("[")){
                temp.insert(0, stringStack.pop());
                if(stringStack.empty()) break;
            }
            stringStack.pop();
            StringBuilder replacement = new StringBuilder();
            int count = numStack.pop();
            for (int i = 0; i < count; i++)
                replacement.append(temp);
            stringStack.push(replacement.toString());
        }
        StringBuilder result = new StringBuilder();
        while (!stringStack.empty()) {
            result.insert(0, stringStack.pop());
        }
        return result.toString();
    }
}
// đệ quy
class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int index = i;
                while(Character.isDigit(s.charAt(++i)));
                int num = Integer.valueOf(s.substring(index, i));
                if(s.charAt(i+1)==']'){
                    i++;
                    continue;
                }
                index = (i++) +1; 
                int count = 1; 
                while(count!=0){
                    if(s.charAt(i)=='[')count++;
                    if(s.charAt(i++)==']')count--;
                }
                String sub = decodeString(s.substring(index, --i));
                while(num-->0)
                    sb.append(sub);
        }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
// bài tập về nhà buổi 5
// 35. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
// 35. Search Insert Position -- TKNP
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while(start < end){
            if(nums[start] == target) return start;
            if(nums[start] != target){
                if(target < nums[start]) return start;
            }
            start++;
        }
        return start;
    }
}
// 268. Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            ans += (temp - nums[i]);
            temp++;
        }
        return ans + temp;
    }
}
// Bài Kiểm Kra Môn Cấu Trúc Dữ liêu
// 1512. Number of Good Pairs
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }
}
// 2215. Find the Difference of Two Arrays
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> lists = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1) {
            set1.add(i);
        }
        for(int i : nums2) {
            set2.add(i);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
           if (set2.contains(nums1[i]) || list1.contains(nums1[i])){
               continue;
           }
            list1.add(nums1[i]);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i]) || list2.contains(nums2[i])){
                continue;
            }
            list2.add(nums2[i]);
        }
        lists.add(list1);
        lists.add(list2);
        return lists;
    }
}
// 2418. Sort the People
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(heights[j] < heights[j+1]){
                    int temp1 = heights[j];
                    String temp2 = names[j];
                    heights[j] = heights[j+1];
                    names[j] = names[j+1];
                    heights[j+1] = temp1;
                    names[j+1] = temp2;
                }
            }
        }
        return names;
    }
}
// 75. Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
// 888. Fair Candy Swap
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < aliceSizes.length; i++)
            sum1 += aliceSizes[i];
        for (int i = 0; i < bobSizes.length; i++)
            sum2 += bobSizes[i];
        int tb = (sum1 - sum2) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == tb)
                    return new int[]{aliceSizes[i], bobSizes[j]};
            }
        }
        return null;
    }
}
// 202. Happy Number
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum,digit;
        while (set.add(n))
        {
            sum = 0;
            while (n > 0) {
                digit = n%10;
                sum += digit*digit;
                n /= 10;
            }
            if (sum == 1) return true;
            else
                n = sum;
        }
        return false;
    }
}
// Bài tập về nhà buổi 7
// 1346. Check If N and Its Double Exist
class Solution {
    public boolean checkIfExist(int[] arr) { // =>>  độ phức tạp độ toán là O(n^2)
        //    = 1;        = n ;       = n;        => n(3n+1) + 1
        for(int i = 0; i < arr.length; i++){
            //    = 1;     = n ;           = n;   => n + 2n +1 => 3n + 1
            for(int j = 0; j < arr.length; j++){
                //        = n           +   n   => 2n + 1
                if(arr[i] == 2 * arr[j] && i != j){
                    return true;// = 1
                }
            }
        }
        return false; // = 1
    }
}
// 766. Toeplitz Matrix
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) { // =>>  độ phức tạp độ toán là O(n^2)
        //     = 1;            = n ;         = n;          => n(m + mn + 1) + 1 => nm + mn^2 + n + 1
         for(int i = 0; i< matrix.length-1; i++){
             //    = 1;        = m ;                = m;   => m + mn + 1 
             for(int j = 0; j < matrix[i].length-1; j++){
                //         = m * n
                 if(matrix[i][j] != matrix[i+1][j+1])
                    //   = 1
                     return false;
             }
         }
         // = 1
         return true;
     }
 }
 // Bài tập về nhà buổi 8
 // 21. Merge Two Sorted Lists
// class Solution {
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if (list1 == null) return list2;
        // if (list2 == null) return list1;
        // if (list1.val < list2.val) {
            // list1.next = mergeTwoLists(list1.next, list2);
            // return list1;
        // } else {
            // list2.next = mergeTwoLists(list1, list2.next);
            // return list2;
        // }
    // }
// }
// 707. Design Linked List
// class MyLinkedList {
    // Node head;
// 
    // public MyLinkedList() {
// 
    // }
// 
    // public int get(int index) {
        // Node curr = head;
        // int count = 0;
        // while (curr != null) {
            // if (count == index) {
                // return curr.val;
            // }
            // count++;
            // curr = curr.next;
        // }
        // return -1;
    // }
// 
    // public void addAtHead(int val) {
        // Node newNode = new Node(val);
        // newNode.next = head;
        // head = newNode;
    // }
// 
    // public void addAtTail(int val) {
        // if (head == null) {
            // addAtHead(val);
            // return;
        // }
        // Node newNode = new Node(val);
        // Node lastNode = head;
        // while (lastNode.next != null) {
            // lastNode = lastNode.next;
        // }
        // lastNode.next = newNode;
    // }
// 
    // public void addAtIndex(int index, int val) {
        // if (index == 0) {
            // addAtHead(val);
        // }
        // Node newNode = new Node(val);
        // Node currNode = head;
        // int count = 0;
        // while (currNode != null) {
            // count++;
            // if (count == index) {
                // newNode.next = currNode.next;
                // currNode.next = newNode;
                // break;
            // }
            // currNode = currNode.next;
        // }
    // }
// 
    // public void deleteAtIndex(int index) {
        // if (index == 0) {
            // head = head.next;
        // }
        // Node currNode = head;
        // int count = 0;
        // while (currNode != null) {
            // if (count == index - 1) {
                // if (currNode.next != null) {
                    // currNode.next = currNode.next.next;
                // } else {
                    // currNode.next = null;
                // }
            // }
            // currNode = currNode.next;
            // count++;
        // }
    // }
// 
    // static class Node {
        // int val;
        // Node next;
// 
        // public Node(int val) {
            // this.val = val;
        // }
    // }
// }
// 203. Remove Linked List Elements
// class Solution {
    // public ListNode removeElements(ListNode head, int val) {
        // if (head == null) return head;
        // while (head.val == val) {
            // head = head.next;
            // if (head == null) return head;
        // }
        // ListNode currNode = head;
        // while (currNode != null) {
            // if (currNode.next == null) return head;
            // if (currNode.next.val == val) {
                // currNode.next = currNode.next.next;
            // } else {
                // currNode = currNode.next;
            // }
        // }
        // return head;
    // }
// }
// 206. Reverse Linked List
// class Solution {
    // public ListNode reverseList(ListNode head) {
        // ListNode curr = head;
        // while (curr != null && curr.next != null) {
            // ListNode nextNode = curr.next;
            // curr.next = nextNode.next;
            // nextNode.next = head;
            // head = nextNode;
        // }
        // return head;
    // }
// }

// Bài tập về nhà buổi 9
// 155. Min Stack

// class MinStack {
    // Node head;
// 
    // public MinStack() {
// 
    // }
// 
    // public void push(int val) {
        // if (head == null) {
            // head = new Node(val, val);
        // } else {
            // Node newNode = new Node(val, Math.min(head.min, val));
            // newNode.next = head;
            // head = newNode;
        // }
    // }
// 
    // public void pop() {
        // head = head.next;
    // }
// 
    // public int top() {
        // return head.val;
    // }
// 
    // public int getMin() {
        // return head.min;
    // }
// 
    // class Node {
        // int val;
        // int min;
        // Node next;
// 
        // Node(int val, int min) {
            // this.val = val;
            // this.min = min;
        // }
    // }
// }

// 2073. Time Needed to Buy Tickets

// class Solution {
    // public int timeRequiredToBuy(int[] tickets, int k) {
        // int val = tickets[k];
        // int second = 0;
        // for (int i = 0; i < tickets.length; i++) {
            // if (tickets[i] < val) {
                // second += tickets[i];
            // } else {
                // if (i > k) {
                    // second--;
                // }
                // second += val;
            // }
        // }
        // return second;
    // }
// }

// Bài tập về nhà buổi 10

// 387. First Unique Character in a String

// class Solution {
    // public int firstUniqChar(String s) {
        //  Map<Character, Integer> map = new HashMap<>();
        //  for (int i = 0; i < s.length(); i++) {
            //  map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        //  }
        //  for (int i = 0; i < s.length(); i++) {
            //  if (map.get(s.charAt(i)) == 1) return i;
        //  }
        //  return -1;
    //  }
//  }

// 771. Jewels and Stones

// class Solution {
    // public int numJewelsInStones(String jewels, String stones) {
        // Set<Character> set = new HashSet<>();
        // for (char c : jewels.toCharArray()) {
            // set.add(c);
        // }
        // int count = 0;
        // for (int i = 0; i < stones.length(); i++) {
            // if (set.contains(stones.charAt(i))) {
                // count += 1;
            // }
        // }
        // return count;
    // }
// }


// Bài Tập về nhà buổi 11
// 145. Binary Tree Postorder Traversal

// class Solution {
    // public List<Integer> postorderTraversal(TreeNode root) {
        // List<Integer> list = new LinkedList<>();
        // preoder(root, list);
        // return list;
    // }
// 
    // private void preoder(TreeNode root, List<Integer> list) {
        // if (root == null) return;
        // preoder(root.left, list);
        // preoder(root.right, list);
        // list.add(root.val);
    // }
// }

// 94. Binary Tree Inorder Traversal

// class Solution {
    // public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> list = new LinkedList<>();
        // preoder(root, list);
        // return list;
    // }
    // private void preoder(TreeNode root, List<Integer> list) {
        // if (root == null) return;
        // preoder(root.left, list);
        // list.add(root.val);
        // preoder(root.right, list);
    // }
// }

// 108. Convert Sorted Array to Binary Search Tree

// class Solution {
    // public TreeNode sortedArrayToBST(int[] nums) {
        //  return createBST(nums, 0, nums.length - 1);
    //  }
//  
    //  private TreeNode createBST(int nums[], int left, int right) {
        //  if (left > right) return null;
        //  int mid = (left + right) / 2;
        //  TreeNode root = new TreeNode(nums[mid]);
        //  root.left = createBST(nums, left, mid - 1);
        //  root.right = createBST(nums, mid + 1, right);
        //  return root;
    //  }
//  }
// 
// 98. Validate Binary Search Tree

// class Solution {
    // TreeNode node = null;
    // public boolean isValidBST(TreeNode root) {
        // if (root != null) {
            // if (!isValidBST(root.left)) return false;
            // if (node != null && root.val <= node.val) return false;
            // node = root;
            // return isValidBST(root.right);
        // }
        // return true;
    // }
// }


// Bài Tập về nhà buổi 12

// 841. Keys and Rooms : -- dùng DFS và HashSet
// class Solution {
    // public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Set<Integer> set = new HashSet<>();
        // set.add(0);
        // DFS(rooms, set, 0);
        // return set.size() == rooms.size();
    // }
// 
    // private void DFS(List<List<Integer>> rooms, Set<Integer> set, int u) {
        // for (int v : rooms.get(u)) {
            // if (!set.contains(v)) {
                // set.add(v);
                // DFS(rooms, set, v);
            // }
        // }
    // }
// }

// 841. Keys and Rooms : -- dùng DFS và mảng boolean
// class Solution {
    // public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // int n = rooms.size();
        // boolean[] visited = new boolean[n];
        // DFS(rooms, visited, 0);
        // while (--n > 0) {
            // if (!visited[n]) {
                // return false;
            // }
        // }
        // return true;
    // }
    // private void DFS(List<List<Integer>> rooms, boolean[] visited, int u) {
        // for (int v : rooms.get(u)) {
            // if (!visited[v]) {
                // visited[v] = true;
                // DFS(rooms, visited, v);
            // }
        // }
    // }
// }

// 841. Keys and Rooms : -- dùng BFS - mảng boolean
// class Solution {
    // public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // int n = rooms.size();
        // boolean[] visited = new boolean[n]; // tạo 1 mảng để đánh dấu
        // Queue<Integer> queue = new LinkedList<>(); // tạo hàng đợi
        // queue.add(0); // cho đỉnh đầu tiên vào queue
        // visited[0] = true; // đánh dấu đỉnh đã được thăm
        // while (!queue.isEmpty()) {  
            // int size = queue.size();
            // while (size-- > 0) {
                // int u = queue.poll(); // lấy và xóa đầu hàng đợi
                // for (int v : rooms.get(u)) {
                    // if (!visited[v]) { // nếu chưa được đánh dấu
                        // visited[v] = true; // đánh dấu
                        // queue.add(v); // cho vào queue
                    // } 
                // }
            // }
        // }
        // while (--n > 0) { // duyệt mảng đánh dấu
            // if (!visited[n]) {
                // return false;
            // }
        // }
        // return true;
    // }
// }

// 841. Keys and Rooms : -- dùng BFS - HashSet
// class Solution {
    // public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Set<Integer> set = new HashSet<>();
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(0);
        // set.add(0);
        // while (!queue.isEmpty()) {
            // int size = queue.size();
            // while (size-- > 0) {
                // int u = queue.poll();
                // BFS(rooms, set, 0);
            // }
        // }
        // return set.size() == rooms.size();
    // }
    // private void BFS(List<List<Integer>> rooms, Set<Integer> set, int u) {
        // for (int v : rooms.get(u)) {
            // if (!set.contains(v)) {
                // set.add(v);
                // BFS(rooms, set, v);
            // }
        // }
    // }
// }

// 102. Binary Tree Level Order Traversal - BFS
// class Solution {
    // public static List<List<Integer>> levelOrder(TreeNode root) {
        // List<List<Integer>> lists = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Queue<TreeNode> queue = new LinkedList<>();
        // if (root == null) return lists;
        // queue.add(root);
        // while (!queue.isEmpty()) {
            // int size = queue.size();
            // lists.add(new ArrayList<>());
            // while (size-- > 0) {
                // TreeNode node = queue.poll();
                // lists.get(lists.size() - 1).add(node.val);
                // if (node.left != null) {
                    // queue.add(node.left);
                // }
                // if (node.right != null) {
                    // queue.add(node.right);
                // }
            // }
        // }
        // return lists;
    // }
// }

// Kiểm tra hết học phần

// 733. Flood Fill

// class Solution {
    // public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // // nếu pixel ở image[sr][sc] != newColor thì thực hiện thay thế
        // // c0 = image[sr][sc] bằng newColor
        // if (image[sr][sc] != newColor) {
            // // duyệt , lấp đầy
            // DFS(image, sr, sc, image[sr][sc], newColor);
        // }
        // nếu image[sr][sc] == newColor nghĩa là mảng image đã được flood fill(lấp đầy) 
        // thì trả về image luôn
        // return image;
    // }
// 
    // private void DFS(int[][] image, int i, int j, int c0, int newColor) {
        // // i và j là vị trí
        // if (i < 0 || j < 0 || i >= image.length ||
        //  j >= image[0].length || image[i][j] != c0) return;
        // image[i][j] = newColor;
        // DFS(image, i - 1, j, c0, newColor); // i - 1 = bên trái
        // DFS(image, i + 1, j, c0, newColor); // i + 1 = bên phải
        // DFS(image, i, j - 1, c0, newColor); // j - 1 = phía dưới
        // DFS(image, i, j + 1, c0, newColor); // j + 1 = trên đầu
    // }
    // // độ phức tạp thuật toán là : số cột(n) * số dòng(m) 
    // // => Độ phức tạp thuật toán TIME là: O(n*m)
    // // => Độ phức tạp thuật toán SPACE là: O(n*m)
// }

// 1748. Sum of Unique Elements
// public int sumOfUnique(int[] nums) {
    // int sum = 0; // tạo 1 biến tổng
    // for (int i = 0; i < nums.length; i++) {
        // sum += nums[i]; // + tổng các số trong mảng nums
        // nums: // đặt tên cho vòng for thứ 2
        // for (int j = 0; j < nums.length; j++) {
            // while (i != j) {
                // if (nums[i] == nums[j]) { // số sánh nếu nums[i] == nums[j] và j != i
                    // sum -= nums[i]; // lấy tổng trừ đi giá trị ở vị trí nums[i]
                    // break nums; // thoát vòng for thứ 2 tiếp tục duyệt
                // }
                // break; 
            // }
        // }
    // }
    // return sum;
    // Độ phức tạp thuật toán TIME là: O(n^2)
    // Độ phức tạp thuật toán SPACE là: O(1)
// }


// 844. Backspace String Compare

// class Solution {
    // public boolean backspaceCompare(String S, String T) {
        // return backspaced(S).equals(backspaced(T)); 
        // trả về kết quả so sánh kết quả trả về của 2 chuỗi
    // }
// 
    // private String backspaced(String s) {
        // Stack<Character> stack = new Stack<>();
        // for (char c : s.toCharArray()) {
            // if (c != '#') { 
                // stack.push(c); // cho ký tự lên trên cùng , gỡ bỏ nó
            // } else if (!stack.isEmpty()) { 
                // stack.pop(); // trả về ký tự trên cùng , gỡ bỏ nó
            // }
        // }
        // return stack.toString();
    // }
// }
// Độ phức tạp thuật toán TIME là: O(m+n) trong đó m = S.length()  và n = T.length()
// Độ phức tạp thuật toán SPACE là: O(m+n) trong đó m = S.length()  và n = T.length()