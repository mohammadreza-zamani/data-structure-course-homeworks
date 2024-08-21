# Question: Finding the Next Greater Element

(Time Limit: 1 second, Memory Limit: 256 megabytes)

Question Description:

Given an array of n integers, find the next greater element for each element of the array. The next greater element of a number x is the first greater number to its right in the array. If there is no greater element to the right, then consider the next greater element as -1.

Input Format:

    The first line contains an integer n denoting the size of the array.
    The second line contains n integers a[1], a[2], ..., a[n] representing the elements of the array.
    Constraints: 1 ≤ n ≤ 100,000

Output Format:

    Print n space-separated integers, where the i-th integer represents the next greater element for the i-th element in the input array. If there is no greater element, print -1.

Sample Input 1:

	4
	4 6 2 8

Sample Output 1:

	6 8 8 -1

Explanation:

    For the element 4, the next greater element is 6.
    For the element 6, the next greater element is 8.
    For the element 2, the next greater element is 8.
    For the element 8, there is no greater element to its right, so we print -1.

Sample Input 2:

	5
	5 2 3 1 4

Sample Output 2:

	-1 3 4 4 -1