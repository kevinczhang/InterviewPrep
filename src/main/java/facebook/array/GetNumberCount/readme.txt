Given a large sorted array which contains lots of duplicate numbers, find out the occurrence of each number. Time complexity should be better than O(n).

//   input [1 (X200), 2(X50), 3(X10)]
//   count the occurrence of the elements
//   output {
//     1: 200, 
//     2: 50,
//     3: 10,
//   }


the solution of start point to start point + 2^n is freaking genius.
worst case comparison:
[1,2,3,4,5,6] start point + binary search: O(nlogn), start point + 2^n: O(n)
