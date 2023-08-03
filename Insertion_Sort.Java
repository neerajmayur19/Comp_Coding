

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      int i;
      int value = arr[0];
      int hole = 0;
      for(i=1;i<n;i++)
      {
          value = arr[i];
          hole = i;
          while(hole > 0 && arr[hole-1]>value)
          {
              arr[hole] = arr[hole-1];
              hole--;
          }
          arr[hole] = value;
      }
  }
}
