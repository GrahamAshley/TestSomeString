package com.test.pa;

/**
 * @Author 101217
 * @Date 2021/6/25
 * @Version 1.0
 */
public class Merge_sort_test {
    public static void Merge(int[] A,int p,int q,int r){

        int[] tmp = new int[r-p+1];//声明一个临时数组，长度为要归并数组的长度
        int i = p;   //记住左边数组第一个元素的下标
        int j = q+1; //记住右边数组第一个元素的下标
        int k = 0;
        while(i <= q && j <= r){
            //左边数组元素和右边数组元素比较，把小的元素赋给临时数组
            if(A[i] <= A[j]){
                tmp[k++] = A[i++];
            }
            else{
                tmp[k++] = A[j++];
            }
        }
        //把左边剩余的数组元素赋给临时数组
        while(i <= q){
            tmp[k++] = A[i++];
        }
        //把右边剩余的数组元素赋给临时数组
        while(j <= r){
            tmp[k++] = A[j++];
        }
        //用临时数组元素覆盖原数组元素
        for(int k2 = 0;k2 < tmp.length;k2++){
            A[k2+p] = tmp[k2];
        }
    }
    public static void Merge_sort(int[] A,int p,int r){//p为起始位置，r为结束位置
        int q = (p+r)/2;//q为二分位置
        if(p < r){
            //递归调用
            Merge_sort(A,p,q);//递归解决前半部分
            Merge_sort(A,q + 1,r);//递归解决后半部分
            //归并排序数据元素
            Merge(A,p,q,r);//最后将所有有序数组完成归并
        }
    }

    //主函数
    public static void main(String[] args) {
        //建立原始数组，可输入
        int[] A = {5,2,4,7,1,3,2,6};
        System.out.println("原始数据： ");
        for(int i = 0;i < A.length;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        Merge_sort(A,0,A.length -1);//从数组A的0位到A.length-1位排序
        System.out.println("输出结果： ");
        for(int i = 0;i < A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}
