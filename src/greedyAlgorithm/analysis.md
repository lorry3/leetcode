`#135`Candy

`#455`Assign Cookies

`#435`Non-overlapping Intervals
- 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
- 将给定区间集合按照区间的开头(区间的第一个元素)排序.
  依次检查当前区间与下一区间有无重叠.
  如果无重叠,继续向后遍历,将当前区间设为下一区间.
  如果有重叠,则按照贪心算法的思想,将当前区间设置为区间终点更小的那一个区间.
  因为这样的区间能给到后面的区间更大的空间去避免碰撞,为局部最优解.
  直至遍历至最后一个区间,局部最优解收敛至全局最优解.
  
`#605`Can Place Flowers

`#452`Minimum Number of Arrows to Burst Balloons

`#763`Partition Labels

`#122`Best Time to Buy and Sell Stock II