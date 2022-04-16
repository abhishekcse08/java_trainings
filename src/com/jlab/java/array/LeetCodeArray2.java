package com.jlab.java.array;
/*
* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
*
*
*
* */
public class LeetCodeArray2 {

    public int maxArea(int[] height) {

        int max=0;
        for(int i=1;i<height.length;i++){
            for(int j=0;j<i;j++){
                int width = i-j;
                int hight = Math.min(height[i],height[j]);
                int storage = hight*width;

                max = Math.max(max,storage);
            }

        }
        return max;
    }
}
