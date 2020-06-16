package com.handsome.mail.service.impl;

import com.handsome.mail.service.MailService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
class MailServiceImplTest {

	@Autowired
	private MailService mailService;

	@Autowired
	private ITemplateEngine templateEngine;

	@Test
	void sendSimpleMail() {
		mailService.sendSimpleMail("2722963937@qq.com", "SpringBoot简答邮件测试", "这是一个简答的邮件");
	}

	@Test
	void sendHtmlMail() {
		/*
		String content = "<html>\n" +
				"<body>\n" +
				"<h3>SpringBoot发送一封Html邮件!</h3>\n" +
				"</body>\n" +
				"</html>";
		mailService.sendHtmlMail("2722963937@qq.com", "SpringBootHtml邮件测试", content);
		*/
		Context context = new Context();
		String emailContent = templateEngine.process("emailTemplate", context);

		mailService.sendHtmlMail("2722963937@qq.com", "SpringBootTemplate邮件测试", emailContent);
	}

	@Test
	void sendAttachmentsMail() {
		String filePath = "src/main/resources/file/超越本越.jpeg";
		mailService.sendAttachmentsMail("2722963937@qq.com", "SpringBoot附件邮件测试", "有附件，请查收！", filePath);
	}

	@Test
	void sendInlineResourceMail() {
		String rscId = "neo006";
		String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
		String imgPath = "src/main/resources/file/超越本越.jpeg";
		mailService.sendInlineResourceMail("2722963937@qq.com", "SpringBoot图片邮件测试", content, imgPath, rscId);
	}
}