package com.handsome.mail.service;

/**
 * MailService
 *
 * @author handsome
 * @date 2020年 06月16日 00:19:08
 */
public interface MailService {

	void sendSimpleMail(String to, String subject, String content);

	void sendHtmlMail(String to, String subject, String content);

	void sendAttachmentsMail(String to, String subject, String content, String filePath);

	void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
