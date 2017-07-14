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

import java.util.ArrayList;
import java.util.List;

public class Practice10HistogramView extends View {

	public Practice10HistogramView(Context context) {
		super(context);
	}

	public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);


		List<String> mList = new ArrayList<>();
		mList.add("Froyo");
		mList.add("GB");
		mList.add("ICD");
		mList.add("JB");
		mList.add("KitKat");
		mList.add("L");
		mList.add("M");
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
		Path path = new Path();
		Paint mPaint = new Paint();
		mPaint.setColor(Color.WHITE);
		mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
		mPaint.setStrokeWidth(3);
		mPaint.setAntiAlias(true);
		mPaint.setTextSize(30);
		path.setFillType(Path.FillType.WINDING);

		int rectW = 100;
		int deviceWidth = 30;
		int startRectX = 130;
		int starX = 130;
		int startY = 530;

		canvas.drawLine(100, 100, 100, 500, mPaint);
		canvas.drawLine(100, 500, 1000, 500, mPaint);

		for (int i = 0; i < mList.size(); i++) {
			int v = (int) (Math.random() * 80);
			int rectH = 500 - v;
			int recRight =  startRectX+rectW;
			mPaint.setColor(Color.GREEN);
			canvas.drawRect(startRectX, rectH,recRight, 497 , mPaint);

			RectF rectF = new RectF(startRectX,500,recRight,500+40);
			mPaint.setColor(Color.WHITE);
			mPaint.setStrokeWidth(1);

			mPaint.setTextAlign(Paint.Align.CENTER);
			canvas.drawText(mList.get(i), rectF.centerX(), startY, mPaint);

			starX  = starX+rectW+deviceWidth;
			startRectX = recRight +  deviceWidth;
		}
	}
}
