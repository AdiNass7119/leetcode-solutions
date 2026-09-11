bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target) {
    int r=matrixSize;
    int c=matrixColSize[0];
    int h=r*c-1;
    int l=0;
    while(l<=h){
        int mid=(l+h)/2;
        int i=mid/c;
        int j=mid%c;
        if(matrix[i][j]==target){
            return true;
        }
        if(matrix[i][j]<target){
            l=mid+1;
        }
        else{
            h=mid-1;
        }
    }
    return false;
}