#include<iostream>
using namespace std;
 
void replace_elements(int nums[], int n)
{
    if (n <= 1)
      return;
 
    int prev_element = nums[0];
    nums[0] = nums[0] * nums[1];
 
    for (int i=1; i<n-1; i++)
    {
        int curr_element = nums[i];
 
        nums[i] = prev_element * nums[i+1];
 
        prev_element = curr_element;
    }
 
    nums[n-1] = prev_element * nums[n-1];
    }
 
int main()
{
    int nums[] = {0, 1, 3, 4, 5, 6, 7, 8, 10};
    int n = sizeof(nums)/sizeof(nums[0]);
   	cout << "Original array: ";
    for (int i=0; i < n; i++) 
    cout << nums[i] <<" ";
    replace_elements(nums,n);
    cout << "\nNew array elements: ";
    for (int i=0; i < n; i++) 
      cout << nums[i] <<" ";
  return 0;     

}