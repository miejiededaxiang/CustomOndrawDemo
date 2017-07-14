package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

	public Practice11PieChartView(Context context) {
		super(context);
	}

	public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

		Path path = new Path();
		Paint mPaint = new Paint();
		mPaint.setColor(Color.YELLOW);
		mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
		mPaint.setStrokeWidth(3);
		mPaint.setAntiAlias(true);
		mPaint.setTextSize(30);
		path.setFillType(Path.FillType.WINDING);

		RectF rectF = new RectF(300, 200, 800, 700);
		path.arcTo(rectF, -60, 60, false);
		path.lineTo(550, 450);
		canvas.drawPath(path, mPaint);

//		float centeX = rectF.centerX();
//		float centeY = rectF.centerY();
//
//		mPaint.setColor(Color.RED);
//		Path path1 = new Path();
//		path1.arcTo(rectF, 10, 30, false);
//		path1.lineTo(centeX+1, centeY+1);
//		canvas.drawPath(path1, mPaint);
//
//		mPaint.setColor(Color.GREEN);
//		Path path2 = new Path();
//		path2.arcTo(rectF, 55, 90, false);
//		path2.lineTo(centeX+1, centeY-1);
//		canvas.drawPath(path2, mPaint);
//
//		mPaint.setColor(Color.GRAY);
//		Path path3 = new Path();
//		path3.arcTo(rectF, 150, 30, false);
//		path3.lineTo(centeX-1, centeY-1);
//		canvas.drawPath(path3, mPaint);
//
//		rectF.offset(-30, -30);
//		mPaint.setColor(Color.BLUE);
//		Path path4 = new Path();
//		path4.arcTo(rectF, 180, 120, false);
//		path4.lineTo(rectF.centerX(), rectF.centerY());
//		canvas.drawPath(path4, mPaint);
	}
}
