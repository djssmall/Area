<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    
    <script src="js/jquery-2.1.0.min.js"></script>
    
    <script>
        $(function () {
           
            //发送ajax请求，加载所有省份数据
            $.get("province.do",null,function (data) {
                //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

                //1.获取select
                var province = $("#province");
                //2.遍历json数组
                $(data.info).each(function () {
                    //3.创建<option>
                    var option = "<option value='"+this.id+"'>"+this.name+"</option>";

                    //4.调用select的append追加option
                    province.append(option);
                });

            });
            $("#province").change(function () {
                //先获取选中省份的省份id
                //alert($(this).val());
                var id = $(this).val();
                //发送ajax请求，加载所有市份数据
                $.get("city.do",{id:id},function (data) {
                    //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]
                    //1.获取select
                    var city = $("#city");
                    city.empty();
                    city.append("<option>--请选择市--</option>");
                    //2.遍历json数组
                    $(data.info).each(function () {
                        //3.创建<option>
                        var option = "<option value='"+this.id+"'>"+this.name+"</option>";

                        //4.调用select的append追加option
                        city.append(option);
                    });

                });

            });

            $("#city").change(function () {
                //先获取选中省份的省份id
                //alert($(this).val());
                var id = $(this).val();
                //发送ajax请求，加载所有市份数据
                $.get("country.do",{id:id},function (data) {
                    //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

                    //1.获取select
                    var country = $("#country");

                    country.empty();
                    //2.遍历json数组
                    $(data.info).each(function () {
                        //3.创建<option>
                        var option = "<option value='"+this.id+"'>"+this.name+"</option>";

                        //4.调用select的append追加option
                        country.append(option);
                    });

                });

            })
            
        });
        
        
    </script>
    
</head>
<body>



        <select id="province">
            <option>--请选择省份--</option>

        </select>
        <select id="city">
            <option>--请选择市--</option>

        </select>
        <select id="country">
            <option>--请选择县--</option>

        </select>
</body>
</html>