package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {


	private Paint mPaint;
	private Path mPath;

	public Practice2DrawCircleView(Context context) {
		this(context,null);

	}

	public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs,-1);
	}

	public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);


		mPath = new Path();

		mPaint = new Paint();
		mPaint.setAntiAlias(true);
		mPaint.setStyle(Paint.Style.FILL);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

		canvas.drawCircle(300, 200, 150, mPaint);

		mPaint.setStyle(Paint.Style.STROKE);
		canvas.drawCircle(700, 200, 150, mPaint);

		mPaint.setStyle(Paint.Style.FILL);
		mPaint.setColor(Color.BLUE);
		canvas.drawCircle(300, 600, 150, mPaint);

		mPaint.setColor(Color.BLACK);
		mPath.setFillType(Path.FillType.EVEN_ODD);
		mPath.addCircle(750,600,150, Path.Direction.CCW);
		mPath.addCircle(750,600,100, Path.Direction.CCW);
		canvas.drawPath(mPath,mPaint);

	}
}
