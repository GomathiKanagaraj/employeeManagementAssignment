package com.employee.management.entity;
import javax.persistence.*;

@Entity
@Table(name = "dbl_document")
public class Document {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 private Long id;
	 
	 @Column(name = "file_name")
	 private String fileName;
	 
	 
	 @Column(name = "file_type")
	 private String fileType;

	 @Lob
	 private byte[] data;

	 public Document(){

	 }

	public Document(Long id, String fileName, String fileType, byte[] data) {
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}
