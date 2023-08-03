package com.example.barapp

interface OnClickListenerTable {
    fun onClick(tableId: Int)
    fun onDeleteTable(tableData: TableData)
    fun onLongClick(tableData: TableData)
    fun onClearTable(tableData: TableData)
}