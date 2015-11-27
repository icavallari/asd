package br.com.delogic.asd.view;

import java.util.List;

public interface HtmlItemFactory {

    public String[] getTypesResolved();

    public HtmlItem create(FormItem formItem, List<? extends Object> options, List<? extends Object> data);

}
