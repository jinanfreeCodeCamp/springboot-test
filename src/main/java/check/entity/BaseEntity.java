package check.entity;

public class BaseEntity {
    private Integer page;
    private Integer rows;

    public Integer getPage() {
        if(null == page){
            page = 1;
        }
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        if(null == rows){
            rows = 10;
        }
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
