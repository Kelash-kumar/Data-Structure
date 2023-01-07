#include <iostream>
using namespace std;

int getOddOccurrence(int nums[], int n)
{
    for (int i = 0; i < n; i++) {
         
        int ctr = 0;
         
        for (int j = 0; j < n; j++)
        {
            if (nums[i] == nums[j])
                ctr++;
        }
        if (ctr % 2 != 0)
            return nums[i];
    }
    return -1;
}
 
int main()
{
    int nums[] = {5, 7, 8, 8, 5, 8, 7, 7}; 
    int n = sizeof(nums)/sizeof(nums[0]);
    cout << "Original array: ";
    for (int i=0; i < n; i++) 
    cout << nums[i] <<" ";
         cout << "\nNumber which occurs odd number of times: " << getOddOccurrence(nums, n);
 
        return 0;
    }