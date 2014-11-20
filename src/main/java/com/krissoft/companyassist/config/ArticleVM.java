package com.krissoft.companyassist.config;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Default;

public class ArticleVM {

	
	@Command
	public void saveArticle(@BindingParam("param") @Default("") String article) {
		System.out.println("article=" + article);
	}
}
