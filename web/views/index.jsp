<%--
  Created by IntelliJ IDEA.
  User: furao
  Date: 2019-04-08
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/sshAndVue/js/jquery.js"></script>
</head>
<style>
    .s_n{
        width: 100px;
        float: left;
    }

    .o_t{
        float: left;
        width: 400px;
    }

    .pointer{
        cursor: pointer;
    }

    .cl{
        float: left;
    }
</style>
<body>
欢迎来到shelf--hibernateCRUD页面</br>

<div class="top">
    <form id="insertInfo">
        <div class="o_t">
            <div class="s_n">id:</div><div class="cl"><input type="text" name="id"></div>
        </div>
        <div class="o_t">
            <div class="s_n">货架名称:</div><div class="cl"><input type="text" name="shelfNo"></div>
        </div>
        <div class="o_t">
            <div class="s_n">货架描述:</div><div class="cl"><input type="text" name="shelfDesc"></div>
        </div>
        <div class="o_t">
            <div class="s_n">货架状态:</div><div class="cl"><input type="text" name="shelfStatus"></div>
        </div>
        <div class="o_t">
            <div class="s_n">货架容量:</div><div class="cl"><input type="text" name="shelfQty"></div>
        </div>
        <div class="o_t">
            <div class="s_n">父库区id:</div><div class="cl"><input type="text" name="stockId"></div>
        </div>
        <div class="o_t">
            <div class="s_n">pos:</div><div class="cl"><input type="text" name="goPos"></div>
        </div>
        <div class="o_t">
            <div class="s_n">category:</div><div class="cl"><input type="text" name="goCategory"></div>
        </div>
        <div class="o_t">
            <div class="s_n">key:</div><div class="cl"><input type="text" name="goKey"></div>
        </div>
        <div class="o_t">
            <div class="s_n">size:</div><div class="cl"><input type="text" name="goSize"></div>
        </div>
        <div class="o_t">
            <button type="button" id="i_b" onclick="insertOrModify()">新增/修改</button>
        </div>
    </form>
</div>
<hr style="clear: left">
<div class="top">
    <form id="searchInfo">
        <div class="o_t">
            <div class="s_n">id:</div><div class="cl"><input type="text" name="id"></div>
        </div>
        <div class="o_t">
            <div class="s_n">货架名称:</div><div class="cl"><input type="text" name="shelfNo"></div>
        </div>
        <button type="button" id="s_b" onclick="searchShelf()">查询</button>
    </form>
</div>
<hr>
<table border="1" cellspacing="0" style="clear: left;font-size: 13px">
    <theard>
        <td>id</td>
        <td>uuid</td>
        <td>time_uuid</td>
        <td>shelf_no</td>
        <td>shelf_desc</td>
        <td>shelf_status</td>
        <td>shelf_qty</td>
        <td>stock_id</td>
        <td>go_pos</td>
        <td>go_category</td>
        <td>go_key</td>
        <td>go_size</td>
        <td>修改/删除</td>
    </theard>
    <tbody id="tbody">

    </tbody>
</table>
</body>

<script>
    var tbody = $("#tbody");
    $(function(){

    })

    function searchShelf(){
        var tableInfo = $("#searchInfo").serialize();
        $.ajax({
            type: "post",
            url: "/sshAndVue/search",
            data: tableInfo,
            dataType: "json",
            success: function (data) {
                if (data.flag) {
                    var td = inTable(data.result);
                    tbody.append(td);
                }
                else{

                }
            },
            error: function (e) {

            }
        });
    }

    /**
     * 将返回结果包装成table
     * @param data
     */
    function inTable(result){
        var str = "";
        for(var i=0;i<result.length;i++){
            var id = "<td c_name='id'>"+result[i].id+"</td>";
            var uuid = "<td c_name='uuid'>"+result[i].uuid+"</td>";
            var timeUuid = "<td c_name='timeUuid'>"+result[i].timeUuid+"</td>";
            var shelfNo = "<td c_name='shelfNo'>"+result[i].shelfNo+"</td>";
            var shelfDesc = "<td c_name='shelfDesc'>"+result[i].shelfDesc+"</td>";
            var shelfStatus = "<td c_name='shelfStatus'>"+result[i].shelfStatus+"</td>";
            var shelfQty = "<td c_name='shelfQty'>"+result[i].shelfQty+"</td>";
            var stockId = "<td c_name='stockId'>"+result[i].stockId+"</td>";
            var goPos = "<td c_name='goPos'>"+result[i].goPos+"</td>";
            var goCategory = "<td c_name='goCategory'>"+result[i].goCategory+"</td>";
            var stocgoKeykId = "<td c_name='goKey'>"+result[i].goKey+"</td>";
            var goSize = "<td c_name='goSize'>"+result[i].goSize+"</td>";
            var option = "<td class='pointer'><span onclick='showInfo(this)'>修改</span>/<span onclick='del(this)'>删除</span></td>";
            var td = id+uuid+timeUuid+shelfNo+shelfDesc+
                shelfStatus+shelfQty+stockId+goPos+goCategory
                +stocgoKeykId+goSize+option;
            var tr = "<tr>"+td+"</tr>";
            str += tr;
        }
        return str;
    }

    /**
     * 点击修改获取当前tr信息并显示到input中
     * @param modify
     */
    function showInfo(modify){
        console.log(modify);
        var td = modify.parentNode.parentNode.childNodes;
        td.forEach( v => getInput(v));
    }

    function getInput(v){
        var name = v.getAttribute("c_name");
        $("#insertInfo input[name='"+name+"']").val(v.innerText);
    }


    function insertOrModify() {

    }
</script>
</html>
