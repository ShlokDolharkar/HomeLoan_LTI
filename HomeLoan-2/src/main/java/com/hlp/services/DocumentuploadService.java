package com.hlp.services;

import java.util.List;

import com.hlp.pojo.DocumentDetails;


public interface DocumentuploadService {
	public boolean addDocumentDetails(DocumentDetails docdetails);
	public boolean updateDocumentDetails(DocumentDetails docdetails);
	public boolean deleteDocumentDetails(DocumentDetails docdetails);
	public List<DocumentDetails > getDocumentDetails();
}
