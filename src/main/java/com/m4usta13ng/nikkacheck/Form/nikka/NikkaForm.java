package com.m4usta13ng.nikkacheck.Form.nikka;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.m4usta13ng.nikkacheck.repository.nikka.Nikka_Span;

/**
 *
 * @author m4usta13ng
 *
 */
public class NikkaForm {

    //    private Integer nikkaId;

    //    private Integer version;

    @Size(min = 1, max = 500)
    @NotNull(message = "必須だよ")
    private String name;

    //    private String userId;

    // サーバ側で設定する値って要らないんだっけ？
    //    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss:SSS")
    //    private LocalTime lastUpdatedTimestamp;
    //
    //    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss:SSS")
    //    private LocalTime createDatetime;

    @Size(max = 2000)
    private String description;

    @NotNull(message = "必須だよ")
    private Nikka_Span span;

}