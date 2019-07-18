package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FenYe {
		//当前请求的页码
		private Integer page=0;
		//每一页显示多少条
		private Integer rows=5;
		//符合要求的记录总数
		private Integer rowCount;
		//封装查询条件
		private Query query;
		public Integer getPage() {
			return page;
		}
		public void setPage(Integer page) {
			this.page = page;
		}
		public Integer getRows() {
			return rows;
		}
		public void setRows(Integer rows) {
			this.rows = rows;
		}
		public Integer getRowCount() {
			return rowCount;
		}
		public void setRowCount(Integer rowCount) {
			this.rowCount = rowCount;
		}
		public Query getQuery() {
			return query;
		}
		public void setQuery(Query query) {
			this.query = query;
		}
		@Override
		public String toString() {
			return "FenYe [page=" + page + ", rows=" + rows + ", rowCount=" + rowCount + ", query=" + query + "]";
		}
}
