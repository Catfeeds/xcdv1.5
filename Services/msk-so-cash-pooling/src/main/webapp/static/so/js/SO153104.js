var SO153104 = {
    formId: "so153104Param",
    saveButtonId: "SO153104_SAVE",
    backButtonId: "SO153104_BACK",
    operateTimeT: "#operateTime",
    init: function () {
        this.bindSavebutton();
        this.bindBackbutton();
        this.bindDatePicber(SO153104.operateTimeT),
            this.changeSelect();
    },
    bindDatePicber: function (timeId) {
        $(timeId).datetimepicker({
            showButtonPanel: true,
            dateFormat: 'yy-mm-dd',
            timeFormat: 'HH:mm:ss',
            changeMonth: true,
            changeYear: true,
            showSecond: true,
            timeText: '时间',
            hourText: '小时',
            minuteText: '分钟',
            secondText: '秒钟',
            currentText: '现在时间',
            closeText: '关闭'
        });
        $(timeId).change(function () {
            var str = $(timeId).val();
            if (str.length = 19) {
                // 判断年月日的格式2010-01-01 15:12:10
                var reg = /^(\d{4})-(0\d{1}|1[0-2])-(0\d{1}|[12]\d{1}|3[01]) (0\d{1}|1\d{1}|2[0-3]):[0-5]\d{1}:([0-5]\d{1})$/;
                if (!reg.test(str)) {
                    $(timeId).val("");
                }
            } else {
                $(timeId).val("");
            }
        });
    },
    bindSavebutton: function () {
        $("#" + SO153104.saveButtonId).click(function () {
            SO153104.uploadData();
        });
    },
    bindBackbutton: function () {
        $("#" + SO153104.backButtonId).click(function () {
            $.pdialog.close();
        });
    },
    uploadData: function () {
        $.alertMessage.confirm("你确定要保存当前数据吗？", function () {
            $.alertMessage.close();
            var formData = getFormData($("#" + SO153104.formId));
            var count = 0;
            // Modify for Bug#1652 by li_huiqian at 2016/9/8 start
            // 必须check
            $("#SO153104DataGrid>tbody>tr").each(function () {
                // 重置输出框颜色
                if ($(this).children("td:eq(0)").hasClass("left")) {
                    $(this).children("td:eq(1)").children("select,input").css("background", "");
                }
                // 如果有必须输入的标志
                if ($(this).children("td:eq(0)").hasClass("required")) {
                    // 检测是否有值
                    var input = $(this).children("td:eq(1)").children("select,input");
                    if (input.val() === "") {
                        input.css("background", "yellow");
                        count++;
                    }
                }
            });
            //// 支付类型 验证
            //var amountType = formData.amountType;
            //if (amountType == '') {
            //    count++;
            //    $("#amountType").css('background', 'yellow');
            //} else {
            //    $("#amountType").css('background', 'none');
            //}
            //// 支付方式 验证
            //var paidType = formData.paidType;
            //if (paidType == '') {
            //    count++;
            //    $("#paidType").css('background', 'yellow');
            //} else {
            //    $("#paidType").css('background', 'none');
            //}
            //// 退款编码 验证
            //var backNo = formData.backNo;
            //if (amountType == '1' && backNo == '') {
            //    count++;
            //    $("#backNo").css('background', 'yellow');
            //} else {
            //    $("#backNo").css('background', 'none');
            //}
            //// 支付流水号 验证
            ////var paidSeq = formData.paidSeq;
            ////if (paidSeq == '') {
            ////    count++;
            ////    $("#paidSeq").css('background', 'yellow');
            ////} else {
            ////    $("#paidSeq").css('background', 'none');
            ////}
            //// 支付金额 验证
            //var paidAmount = formData.paidAmount;
            //if (paidAmount == '') {
            //    count++;
            //    $("#paidAmount").css('background', 'yellow');
            //} else {
            //    $("#paidAmount").css('background', 'none');
            //}
            //// 发生日期 验证
            //var operateTime = formData.operateTime;
            //if (operateTime == '') {
            //    count++;
            //    $("#operateTime").css('background', 'yellow');
            //} else {
            //    $("#operateTime").css('background', 'none');
            //}
            // Modify for Bug#1652 by li_huiqian at 2016/9/8 end
            // 必填为空的 提示
            if (count > 0) {
                $.alertMessage.info("必填项不能为空");
            } else {
                var fromUrl = $("#" + SO153104.formId).attr("action");
                $('#main-content').postUrl(
                    fromUrl, formData, function () {
                        $.alertMessage.info("保存成功", function () {
                            $.alertMessage.close();
                            $.pdialog.close();
                            var fromUrls = fromUrl.split("/");
                            var goFormId = fromUrls[fromUrls.length - 1];
                            $('#main-content').postUrl(Main.contextPath + "/" + goFormId + "/init/", {});
                        });
                    });
            }
        });
    },
    changeSelect: function () {
        // Modify for Bug#1652 by li_huiqian at 2016/9/8 start
        $('#amountType').change(function () {
            var amountType = $('#amountType').val();
            var backNoLabel = $("#backNo").parent().prev();
            // 减免金额控制
            if (amountType == '1') {
                $("#backNo").attr('disabled', false);
                backNoLabel.addClass("required");
            } else {
                $("#backNo").val("");
                $("#backNo").attr('disabled', true);
                backNoLabel.removeClass("required");
            }
        });
        $('#amountType').change();
        // Modify for Bug#1652 by li_huiqian at 2016/9/8 end
    }
}

$(document).ready(function () {
    SO153104.init();
});

