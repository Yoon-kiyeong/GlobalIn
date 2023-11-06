package com.chart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

@WebServlet("/PieChart")
public class PieChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/* 차트 작성 순서
	 * 1. 데이터를 생성한다.
	 * 2. 차트를 생성한다(ChartFactory클래스의 createXxxChart() 메소드로 만듬)
	 * 3. 차트를 원하는 형태로 만듬
	 * 4. 차트를 출력함
	 * - WebApplication에서는 ServletOutputStream 클래스와 ChartUtilities 클래스를 이용하여 브라우저에 출력함
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// 1. 데이터를 생성
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Son-OGong", 63.2);
		dataset.setValue("Jer-PalGae", 37.9);
		dataset.setValue("Sa-OJung", 29.5);
		
		// 2. 차트를 만든다
		JFreeChart chart = ChartFactory.createPieChart("Energy", dataset, true, true, false);
		
		// 3. 차트를 출력
		ServletOutputStream out = response.getOutputStream();
		ChartUtilities.writeChartAsPNG(out,chart,400, 400);
	}

}
