package br.ufs.dcomp.gradecurricularweb.util;

public enum Environment {
	
	URL_ROOT("/sigaaweb"),
	URL_LOGIN("/login"),
	URL_MATRICULA("/matricula");
	
	private String url;

	Environment(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
	
}
