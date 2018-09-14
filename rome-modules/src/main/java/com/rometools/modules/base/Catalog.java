package com.rometools.modules.base;

public interface Catalog {
	
	/**
     * Title of item.
     *
     * XML feeds <g:title></g:title>
     */

    String getTitle();

    void setTitle(String title);
    
    /**
     * Description of item.
     *
     * XML feeds <g:description></g:description>
     */

    String getDescription();

    void setDescription(String description);
    
    
    /**
     * Link of item.
     *
     * XML feeds <g:link></g:link>
     */

    String getLink();

    void setLink(String link);
}
