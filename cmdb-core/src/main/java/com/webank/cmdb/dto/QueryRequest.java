package com.webank.cmdb.dto;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.webank.cmdb.constant.FilterRelationship;
import com.webank.cmdb.util.Pageable;
import com.webank.cmdb.util.Sorting;

public class QueryRequest {
    protected boolean paging = false;
    protected Pageable pageable = new Pageable();
    protected List<Filter> filters = new LinkedList<>();
    protected String filterRs = FilterRelationship.And.getCode();
    protected Sorting sorting = new Sorting();
    protected List<String> groupBys = new LinkedList<>();
    protected List<String> refResources = new LinkedList<>();
    protected List<String> resultColumns;
    protected Dialect dialect = new Dialect();

    public static class Dialect {
        private boolean showCiHistory = false;
        private Map<String, Object> data;

        public boolean getShowCiHistory() {
            return showCiHistory;
        }

        public void setShowCiHistory(boolean showCiHistory) {
            this.showCiHistory = showCiHistory;
        }

        public Map<String, Object> getData() {
            return data;
        }

        public void setData(Map<String, Object> data) {
            this.data = data;
        }

    }

    public List<String> getGroupBys() {
        return groupBys;
    }

    public void setGroupBys(List<String> groupBys) {
        this.groupBys = groupBys;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public Sorting getSorting() {
        return sorting;
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public boolean isPaging() {
        return paging;
    }

    public void setPaging(boolean paging) {
        this.paging = paging;
    }

    public List<String> getRefResources() {
        return refResources;
    }

    public void setRefResource(List<String> refResources) {
        this.refResources = refResources;
    }

    public List<String> getResultColumns() {
        return resultColumns;
    }

    public void setResultColumns(List<String> resultColumns) {
        this.resultColumns = resultColumns;
    }

    public String getFilterRs() {
        return filterRs;
    }

    public void setFilterRs(String filterRs) {
        this.filterRs = filterRs;
    }

    public void setRefResources(List<String> refResources) {
        this.refResources = refResources;
    }

    public Dialect getDialect() {
        return dialect;
    }

    public void setDialect(Dialect dialect) {
        this.dialect = dialect;
    }

}