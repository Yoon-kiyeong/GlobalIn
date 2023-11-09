<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ page import="java.awt.Graphics2D"%>
<%@ page import="java.awt.image.renderable.ParameterBlock"%>
<%@ page import="java.awt.image.BufferedImage"%>
<%@ page import="javax.media.jai.JAI"%>
<%@ page import="javax.media.jai.RenderedOp"%>
<%@ page import="javax.imageio.ImageIO"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%
String imagePath = request.getRealPath("upload");
int size = 1 * 1024 * 1024;
String filename = "";

try {
	MultipartRequest multi = new MultipartRequest(request, imagePath, size, "UTF-8", new DefaultFileRenamePolicy());
	Enumeration files = multi.getFileNames();
	String file = (String) files.nextElement();
	filename = multi.getFilesystemName(file);

} catch (Exception e) {
	e.printStackTrace();
}

ParameterBlock pb = new ParameterBlock();
pb.add(imagePath + "/" + filename);
RenderedOp rOp = JAI.create("fileload", pb);
// 파라미터 블럭에 업로드 된 이미지를 저장하고 "fileLoad" 연산은 JAI가 제공하는 코덱을 사용하는 옵션임
BufferedImage bi = rOp.getAsBufferedImage();
// 불러온 이미지를 bi를 생성한 BufferedImage 클래스에 저장함
BufferedImage thumb = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
// thumb란 이미지 버퍼를 생성하고 버퍼의 사이즈를 설정함

Graphics2D g = thumb.createGraphics();
g.drawImage(bi, 0, 0, 100, 100, null);
// thumb의 이미지 버퍼에 원본 이미지를 정해진 버퍼 사이즈에 맞춰서 드로잉한다.

File file = new File(imagePath + "/sm_" + filename);
ImageIO.write(thumb,"png", file);
// 출력할 위지와 파일 이름을 설정하고 썸네일 이미지를 생성함
// 이미지를 저장할 때는 확장자 jpg, png, gif 형식임
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>썸네일</title>
</head>
<body>
- 원본 이미지 <br>
<img src="/upload/<%=filename %>">

- 썸네일 이미지 <br>
<img src="/upload/sm_<%=filename %>">

</body>
</html>