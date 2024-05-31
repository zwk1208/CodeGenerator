package other.activity

import other.ArmsPluginTemplateProviderImpl
import java.text.SimpleDateFormat
import java.util.Date

/**
 * 通用注解
 * 创建人 zhengwenkai
 * 创建日期 2024/5/31 02:11
 * 描述 AnnotateUtil
 *
 */

fun activityAnnotation(provider: ArmsPluginTemplateProviderImpl) = """
 /**
 *
 * 创建人 zhengwenkai
 * 创建日期 ${SimpleDateFormat("yyyy/MM/dd HH:mm").format(Date(System.currentTimeMillis()))}
 * 描述 ${provider.pageName.value}Activity
 *
 */
"""

fun fragmentAnnotation(provider: ArmsPluginTemplateProviderImpl) = """
 /**
 *
 * 创建人 zhengwenkai
 * 创建日期 ${SimpleDateFormat("yyyy/MM/dd HH:mm").format(Date(System.currentTimeMillis()))}
 * 描述 ${provider.pageName.value}Fragment
 *
 */
"""