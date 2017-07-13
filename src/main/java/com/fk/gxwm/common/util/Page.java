package com.fk.gxwm.common.util;
/**
 * 
* <p>Title:Page </p>
* <p>Description:滚动分页信息 </p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月13日
 */
public class Page {
    //每页数据
    private int everyPage;
    //总页数
    private int totalPage;
    //当前页
    private int currentPage;
    //总记录数
    private int totalCount;
    //是否有下一页
    private boolean hasNextPage;
    //是否有上一页
    private boolean hashPrePage;
    //起始页
    private int beginIndex;
    
    public Page(int everyPage, int totalPage, int currentPage, int totalCount, boolean hasNextPage, boolean hashPrePage, int beginIndex) {
        super();
        this.everyPage = everyPage;
        this.totalPage = totalPage;
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.hasNextPage = hasNextPage;
        this.hashPrePage = hashPrePage;
        this.beginIndex = beginIndex;
    }
    public Page(){
        
    }
    public int getEveryPage() {
        //默认每页5条
        return everyPage == 0 ? 5 : everyPage;
    }
    public void setEveryPage(int everyPage) {
        this.everyPage = everyPage;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public boolean isHasNextPage() {
        return hasNextPage;
    }
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }
    public boolean isHashPrePage() {
        return hashPrePage;
    }
    public void setHashPrePage(boolean hashPrePage) {
        this.hashPrePage = hashPrePage;
    }
    public int getBeginIndex() {
        return beginIndex;
    }
    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

}
